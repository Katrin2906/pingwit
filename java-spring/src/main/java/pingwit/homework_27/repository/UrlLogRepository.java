package pingwit.homework_27.repository;

import org.springframework.data.repository.CrudRepository;
import pingwit.homework_27.entity.UrlLog;

public interface UrlLogRepository extends CrudRepository<UrlLog, Long> {
}
