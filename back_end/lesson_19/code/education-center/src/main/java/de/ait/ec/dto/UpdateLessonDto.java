package de.ait.ec.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
@Data
@Schema(description = "Поля для обновления, null-значения сохраняются в базе")
public class UpdateLessonDto {

    @NotBlank // не может быть передана строка, состоящая из пробелов "    "
    @NotEmpty // не может быть передана пустая строка ""
    private String name;

    @NotEmpty
    @NotBlank
    private String startTime;

    @NotEmpty
    @NotBlank
    private String finishTime;

    @NotEmpty
    @NotBlank
    private String dayOfWeek;
}
