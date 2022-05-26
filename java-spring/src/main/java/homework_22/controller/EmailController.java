package homework_22.controller;

import homework_22.dto.MyEmailDto;
import homework_22.service.MyEmailService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {

    private final MyEmailService emailService;

    public EmailController(MyEmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/send")
    public void sendEmail(@RequestBody MyEmailDto dto) {
        emailService.sendEmail(dto);
    }

}