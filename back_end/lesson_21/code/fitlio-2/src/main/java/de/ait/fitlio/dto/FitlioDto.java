package de.ait.fitlio.dto;

import de.ait.fitlio.model.Fitlio;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FitlioDto {
    private Long id;
    private String title;
    private String description;
    private Integer timeMinute;
    private Integer timeHour;
    @Schema(description = "Date of training", example = "2024-03-02")
    private String date;
    @Schema(description = "Lost calories", example = "250")
    private Integer calorie;
    @Schema(description = "Distance", example = "1500")
    private Integer distance;
    @Schema(description = "Type of training - POWER, GENERAL,...", example = "CARDIO")
    private String fitType;

    public static FitlioDto from(Fitlio fitlio){
        return FitlioDto.builder()
                .id(fitlio.getId())
                .title(fitlio.getTitle())
                .description(fitlio.getDescription())
                .date(fitlio.getDate().toString())
                .timeMinute(fitlio.getTimeMinute())
                .timeHour(fitlio.getTimeHour())
                .calorie(fitlio.getCalorie())
                .distance(fitlio.getDistance())
                .fitType(fitlio.getFitType().toString())
                .build();
    }

    public static List<FitlioDto> from(List<Fitlio> fitlios){
        return fitlios.stream()
                .map(FitlioDto::from)
                .collect(Collectors.toList());
    }
}
