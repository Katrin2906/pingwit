package project.cosmetology.service;

import org.springframework.stereotype.Component;
import project.cosmetology.dto.NoteDto;
import project.cosmetology.dto.OrderDto;
import project.cosmetology.dto.PersonDto;
import project.cosmetology.dto.VisitDto;
import project.cosmetology.entity.Note;
import project.cosmetology.entity.Order;
import project.cosmetology.entity.Person;
import project.cosmetology.entity.Visit;

import java.util.List;

@Component
public class PersonConverter {
    private final OrderConverter orderConverter;
    private final VisitConverter visitConverter;
    private final NoteConverter noteConverter;

    public PersonConverter(OrderConverter orderConverter, VisitConverter visitConverter, NoteConverter noteConverter) {
        this.orderConverter = orderConverter;
        this.visitConverter = visitConverter;
        this.noteConverter = noteConverter;
    }

    public PersonDto toFront(Person person) {
        NoteDto noteDto = noteConverter.toFront(person.getNote());
        List<OrderDto> orderDtos = orderConverter.toFront(person.getOrders());
        List<VisitDto> visitDtos = visitConverter.toFront(person.getVisits());

        return new PersonDto(person.getId(), person.getName(), person.getGender(), person.getAge(), noteDto, person.getNumber(), orderDtos, visitDtos);
    }

    public Person toLocal(PersonDto dto) {
        Note note = noteConverter.toLocal(dto.noteDto());
        List<Visit> visits = visitConverter.toLocal(dto.visitDtos());
        List<Order> orders = orderConverter.toLocal(dto.orderDtos());

        Person person = new Person();
        person.setId(dto.id());
        person.setAge(dto.age());
        person.setGender(dto.gender());
        person.setName(dto.name());
        person.setNumber(dto.number());
        person.setNote(note);
        person.setVisits(visits);
        person.setOrders(orders);

        return person;
    }
}

