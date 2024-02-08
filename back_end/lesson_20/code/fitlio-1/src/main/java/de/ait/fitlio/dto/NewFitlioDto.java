package de.ait.fitlio.dto;

import de.ait.fitlio.model.Fitlio;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

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

    @Schema(description = "minutes of training, duration", example = "15")
    @NotEmpty
    private int timeMinute;
    @Schema(description = "hours of training, duration", example = "1")
    @NotEmpty
    private int timeHour;
    @Schema(description = "date", example = "2024-02-02")
    @Pattern(regexp = "^(?:(?:19|20)\\d\\d)-(?:0[1-9]|1[0-2])-(?:0[1-9]|1\\d|2\\d|3[0-1])$")
    private LocalDate date;
    @Schema(description = "burned calories ", example = "250")
    @NotEmpty
    private int calorie;
    @Schema(description = "distance in meters ", example = "5000")
    @NotEmpty
    private int distance; // будем округлять до целого
    @Schema(description = "type of exercises ", example = "CARDIO")
    private Fitlio.FitType fitType; // может быть String



}
