package homework_21.task_2;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UserConverter {

    public User convert(User user, Long id) {
        return new User(UUID.randomUUID().toString(), user.name(), user.phoneNumber());
    }
}
