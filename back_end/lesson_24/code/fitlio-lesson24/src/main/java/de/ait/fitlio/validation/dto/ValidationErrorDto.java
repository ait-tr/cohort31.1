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
@Schema(name = "ValidationError", description = "Error validation description")
public class ValidationErrorDto {
    @Schema(description = "field's name, where error occured", example = "class field name")
    private String field;
    @Schema(description = "wrong user input rejected by server")
    private String rejectedValue;
    @Schema()
    private String message;


}
