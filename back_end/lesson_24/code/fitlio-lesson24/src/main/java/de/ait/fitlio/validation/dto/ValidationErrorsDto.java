package de.ait.fitlio.validation.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Schema(name = "ValidationError", description = "info about errors in validation")
public class ValidationErrorsDto {
    @Schema(description = "Errors validation list")
    private List<ValidationErrorDto> errors;

}
