package de.ait.ec.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class NewLessonDto {

    @Schema(description = "Идентификатор существующего урока, если задано - остальные поля указывать не нужно")
    private Long existsLessonId;

    @NotNull
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
