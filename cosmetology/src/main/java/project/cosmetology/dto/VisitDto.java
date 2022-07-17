package project.cosmetology.dto;

import java.time.LocalDateTime;
import java.util.List;

public record VisitDto(Long id, LocalDateTime visitDate, List<ProcedureDto> procedureDtos) {
}
