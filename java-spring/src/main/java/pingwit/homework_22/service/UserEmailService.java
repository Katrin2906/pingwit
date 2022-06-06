package pingwit.homework_22.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import pingwit.homework_22.dto.UserEmailDto;
import pingwit.homework_22.property.UserEmailProperty;

@Service
public class UserEmailService {

    private final JavaMailSender javaMailSender;
    private final UserEmailProperty emailProperty;

    public UserEmailService(JavaMailSender javaMailSender, UserEmailProperty emailProperty) {
        this.javaMailSender = javaMailSender;
        this.emailProperty = emailProperty;
    }

    public void sendEmail(UserEmailDto userEmail) {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom(emailProperty.from());
        message.setTo(userEmail.to());
        message.setSubject(userEmail.subject());
        message.setText(userEmail.text() + emailProperty.signature());

        javaMailSender.send(message);
    }
}
