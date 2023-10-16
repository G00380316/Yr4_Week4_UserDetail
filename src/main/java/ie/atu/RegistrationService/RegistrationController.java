package ie.atu.RegistrationService;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class RegistrationController {

    private NotificationServiceClient notificationServiceClient;

    @Autowired
    public RegistrationController(NotificationServiceClient notificationServiceClient) {
        this.notificationServiceClient = notificationServiceClient;
    }

    /*
     * @PostMapping("/confirm")
     * public UserDetails getNewUser(@RequestBody UserDetails user) {
     * return user;
     * }
     */

    @PostMapping("/confirm")
    public Map<String, String> notiHandler(@RequestBody UserDetails userDetails) {
        String confirm =", (username:" + userDetails.getUsername() + ") (email:" + userDetails.getEmail() + ") ";
        String alert = notificationServiceClient.alert(userDetails) + confirm;

        Map<String, String> responseMessage = new HashMap<>();
        responseMessage.put(alert,"confirmed");
        return responseMessage;
    }
}
