package pingwit.homework_27.servise;


import org.springframework.stereotype.Service;
import pingwit.homework_27.entity.UrlLog;
import pingwit.homework_27.repository.UrlLogRepository;

import java.time.LocalDateTime;

@Service
public class UrlLogService {

    private final UrlLogRepository urlLogRepository;

    public UrlLogService(UrlLogRepository urlLogRepository) {
        this.urlLogRepository = urlLogRepository;
    }

    public void save(String requestURI) {
        UrlLog urlLog = new UrlLog();
        urlLog.setUrl(requestURI);
        urlLog.setRequestDate(LocalDateTime.now());

        urlLogRepository.save(urlLog);
    }
}