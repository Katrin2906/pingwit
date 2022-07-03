package pingwit.homework_29.dto;

import pingwit.homework_29.validation.BaseInfo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public record TonometrDto(
        @NotNull(groups = BaseInfo.class)
        Long id,
        @NotBlank(groups = BaseInfo.class)
        String producer,
        @Min(100)
        @Max(200)
        Integer modelNumber) {

}
