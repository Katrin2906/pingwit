package pingwit.homework_22.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "my.email.property")
@Validated // эта аннотация на данный момент не несет пользы, чтобы валидировать необходимо рядом с полями добавить аннотации вроде @Min, @Max и т.д.
public record MyEmailProperty(String from, String signature, Integer age) {
  //MyEmailProperty - "My" как-то совсем по-домашнему. лучше не использовать такое именование в проекте
}
