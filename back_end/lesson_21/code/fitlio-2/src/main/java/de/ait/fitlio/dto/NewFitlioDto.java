package de.ait.fitlio.dto;

import de.ait.fitlio.model.Fitlio;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.Getter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class NewFitlioDto {

    @Schema(description = "training title", example = "Fitness, morning jogging, ...")
    @NotNull
    @NotBlank
    @NotEmpty
    @Size(max = 50)
    private String title;

    @Schema(description = "training notes and comments", example = "What have been done...")
    @NotNull
    @NotBlank
    @NotEmpty
    @Size(max = 1000)
    private String description;

    @Schema(description = "Date of training", example = "2024-03-02")
    @Pattern(regexp = "^(?:(?:19|20)\\d\\d)-(?:0[1-9]|1[0-2])-(?:0[1-9]|1\\d|2\\d|3[0-1])$")
    private String date;

    @Schema(description = "minutes of training, duration", example = "15")
    @Min(value = 0, message = "Minutes must be greater than or equal to 0")
    private Integer timeMinute;

    @Schema(description = "hours of training, duration", example = "1")
    @Min(value = 0, message = "Calorie must be greater than or equal to 0")
    private Integer timeHour;

    @Schema(description = "burned calories ", example = "250")
    @Min(value = 1, message = "Calorie must be greater than or equal to 1")
    private Integer calorie;

    @Schema(description = "distance in meters ", example = "5000")
    @Min(value = 1, message = "Distance must be greater than or equal to 1")
    private Integer distance; // будем округлять до целого

    @Schema(description = "type of exercises ", example = "CARDIO")
    private Fitlio.FitType fitType; // может быть String

}
