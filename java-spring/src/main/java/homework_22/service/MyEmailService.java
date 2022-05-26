package homework_22.service;

import homework_22.dto.MyEmailDto;
import homework_22.property.MyEmailProperty;
import org.springframework.stereotype.Service;

@Service
public class MyEmailService { // MyEmailService -> UserEmailService

    private final JavaMailSender javaMailSender;
    private final MyEmailProperty emailProperty;

    public MyEmailService(JavaMailSender javaMailSender, MyEmailProperty emailProperty) {
        this.javaMailSender = javaMailSender;
        this.emailProperty = emailProperty;
    }

    public void sendEmail(MyEmailDto pingwitEmail) {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom(emailProperty.from());
        message.setTo(pingwitEmail.to());
        message.setSubject(pingwitEmail.subject());
        message.setText(pingwitEmail.text() + emailProperty.signature());

        javaMailSender.send(message);
    }
