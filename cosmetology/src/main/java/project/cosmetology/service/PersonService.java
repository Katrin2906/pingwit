package project.cosmetology.service;

import org.springframework.stereotype.Service;
import project.cosmetology.dto.PersonDto;
import project.cosmetology.entity.Person;
import project.cosmetology.repository.PersonRepository;

@Service
public class PersonService {
    private final PersonConverter personConverter;
    private final PersonRepository personRepository;

    public PersonService(PersonConverter personConverter, PersonRepository personRepository) {
        this.personConverter = personConverter;
        this.personRepository = personRepository;
    }

    public PersonDto findById(Long id) {

        return personRepository.findById(id)
                .map(personConverter::toFront)
                .orElse(null);
    }

    public Long save(PersonDto dto) {
        Person person = personConverter.toLocal(dto);
        return personRepository.save(person).getId();
    }

}
