package de.ait.fitlio.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Data
// @AllArgsConstructor
// @NonstructorArgsCo
@Builder
@Schema(name = "Message", description = "Any message from server")
public class StandardResponseDto {
    @Schema(description = "Возможно: сообщение об ошибке, об изменении состояния и т.д.", example = "Неверный ввод данных")
    private String message;
}
