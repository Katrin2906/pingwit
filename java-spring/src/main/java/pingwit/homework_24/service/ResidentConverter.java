package pingwit.homework_24.service;

import org.springframework.stereotype.Component;
import pingwit.homework_24.dto.ResidentDto;
import pingwit.homework_24.entity.Resident;

import java.util.List;

@Component
public class ResidentConverter {

    public Resident toLocal(ResidentDto ResidentDto) {
        Resident Resident = new Resident();

        Resident.setId(ResidentDto.id());
        Resident.setName(ResidentDto.name());

        return Resident;
    }

    public ResidentDto toFront(Resident Resident) {
        return new ResidentDto(Resident.getId(), Resident.getName());
    }

    public List<Resident> toLocal(List<ResidentDto> dtos) {
        return dtos.stream()
                .map(this::toLocal)
                .toList();
    }

    public List<ResidentDto> toFront(List<Resident> entities) {
        return entities.stream()
                .map(this::toFront)
                .toList();
    }
}
