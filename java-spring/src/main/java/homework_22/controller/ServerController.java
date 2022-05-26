package homework_22.controller;


import homework_22.property.EmailPropertyRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server")
public class ServerController {

    private final String serverName;
    private final Integer port;
    private final EmailPropertyRecord emailPropertyRecord;

    public ServerController(
            @Value("${pingwit.server.name}") String serverName,
            @Value("${pingwit.server.port}") Integer port,
            EmailPropertyRecord emailPropertyRecord
    ) {
        this.serverName = serverName;
        this.port = port;
        this.emailPropertyRecord = emailPropertyRecord;
    }

    @GetMapping("/name")
    public String serverName() {
        return serverName;
    }
}

