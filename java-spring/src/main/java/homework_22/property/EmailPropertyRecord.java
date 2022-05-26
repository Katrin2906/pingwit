package homework_22.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

// этот класс не нужен
@ConfigurationProperties(prefix = "spring.mail")
public record EmailPropertyRecord(String host, Integer port, String username, String password) {

}
