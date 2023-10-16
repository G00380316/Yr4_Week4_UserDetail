package ie.atu.RegistrationService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping
public class RegistrationController {

    @PostMapping("/confirm")
    public UserDetails getNewUser(@RequestBody UserDetails user) {
        return user;
    }
}
