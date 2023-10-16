package ie.atu.RegistrationService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "notification-service", url = "http://localhost:8082")
public interface NotificationServiceClient {

    @PostMapping("/notification")
    String alert(@RequestBody UserDetails user);

}
