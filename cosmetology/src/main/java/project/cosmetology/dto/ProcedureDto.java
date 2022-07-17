package project.cosmetology.dto;

import java.math.BigDecimal;

public record ProcedureDto(Long id, String procedureName, String description, BigDecimal price
) {
}
