package ie.atu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class UserV2Application {

	public static void main(String[] args) {
		SpringApplication.run(UserV2Application.class, args);
	}

}
