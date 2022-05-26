package homework_22.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "my.email.property")
@Validated
public record MyEmailProperty(String from, String signature, Integer age) {
}