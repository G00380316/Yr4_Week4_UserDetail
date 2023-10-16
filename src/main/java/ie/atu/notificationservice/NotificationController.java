package ie.atu.notificationservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NotificationController {
    
    @PostMapping("/notification")
    public String alert(@RequestBody UserDetails user) {
        String message = "message: User " + user.getUsername() + " (" + user.getEmail()
                + ") has been successfully registered";
        return message;
    }

}
