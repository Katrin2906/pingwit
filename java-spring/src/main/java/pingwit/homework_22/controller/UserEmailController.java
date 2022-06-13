package pingwit.homework_22.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pingwit.homework_22.dto.UserEmailDto;
import pingwit.homework_22.service.UserEmailService;

//@RestController
//@RequestMapping("/email")
public class UserEmailController {

    private final UserEmailService emailService;

    public UserEmailController(UserEmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/send")
    public void sendEmail(@RequestBody UserEmailDto dto) {
        emailService.sendEmail(dto);
    }

}

