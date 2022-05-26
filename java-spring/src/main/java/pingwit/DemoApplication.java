package pingwit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import pingwit.homework_22.property.MyEmailProperty;

@SpringBootApplication
@EnableConfigurationProperties({MyEmailProperty.class})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
