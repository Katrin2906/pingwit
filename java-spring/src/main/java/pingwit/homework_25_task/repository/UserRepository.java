package pingwit.homework_25_task.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import pingwit.homework_25_task.entity.User;

import java.util.List;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    List<User> findAllByIdIn(List<User> ids);

}


