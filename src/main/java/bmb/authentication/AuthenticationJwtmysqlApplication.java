package bmb.authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class AuthenticationJwtmysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationJwtmysqlApplication.class, args);
	}

}
