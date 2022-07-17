package project.cosmetology.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import project.cosmetology.entity.Person;

public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {
}
