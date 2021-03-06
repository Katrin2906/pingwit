package project.cosmetology.service;

import org.springframework.stereotype.Component;
import project.cosmetology.dto.ProcedureDto;
import project.cosmetology.dto.VisitDto;
import project.cosmetology.entity.Visit;

import java.util.List;

@Component
public class VisitConverter {

    private final ProcedureConverter procedureConverter;

    public VisitConverter(ProcedureConverter procedureConverter) {
        this.procedureConverter = procedureConverter;
    }

    public Visit toLocal(VisitDto dto) {
        if (dto == null) {
            return null;
        }

        Visit visit = new Visit();

        visit.setId(dto.id());
        // visit.setPerson(person);
        visit.setVisitDate(dto.visitDate());

        return visit;
    }

    public VisitDto toFront(Visit visit) {
        if (visit == null) {
            return null;
        }
        List<ProcedureDto> procedureDtos = procedureConverter.toFront(visit.getProcedures());

        return new VisitDto(visit.getId(), visit.getVisitDate(), procedureDtos);
    }

    public List<Visit> toLocal(List<VisitDto> visitDtos) {
        if (visitDtos == null) {
            return null;
        }

        return visitDtos.stream()
                .map(this::toLocal)
                .toList();
    }

    public List<VisitDto> toFront(List<Visit> visits) {
        if (visits == null) {
            return null;
        }

        return visits.stream()
                .map(this::toFront)
                .toList();
    }
}
