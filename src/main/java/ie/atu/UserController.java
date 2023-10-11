package ie.atu;

import java.util.Map;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {

    private RegistrationServiceClient registrationServiceClient;
    private final AcknowledgeService acknowledgeService;

    @Autowired
    public UserController(RegistrationServiceClient registrationServiceClient, AcknowledgeService acknowledgeService) {
        this.registrationServiceClient = registrationServiceClient;
        this.acknowledgeService = acknowledgeService;
    }

    @PostMapping("/confirm-and-register")
    public Map<String, String> regHandler(@RequestBody UserDetails userDetails) {
        String confirm = registrationServiceClient.someDetails(userDetails);
        
        Map<String, String> responseMessage = new HashMap<>();
        responseMessage.put(confirm, "responseMessage");
        return responseMessage;
    }
}