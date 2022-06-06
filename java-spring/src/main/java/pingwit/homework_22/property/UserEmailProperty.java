package pingwit.homework_22.property;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "user.email.property")
public record UserEmailProperty(String from, String signature, Integer age) {
}
