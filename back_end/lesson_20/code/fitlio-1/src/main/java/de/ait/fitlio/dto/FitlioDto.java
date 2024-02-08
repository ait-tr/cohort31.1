package de.ait.fitlio.dto;

import de.ait.fitlio.model.Fitlio;
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
    private int timeMinute;
    private int timeHour;
    private LocalDate date;
    private int calorie;
    private int distance;
    private String fitType;

    public static FitlioDto from(Fitlio fitlio){
        return FitlioDto.builder()
                .id(fitlio.getId())
                .date(fitlio.getDate())
                .title(fitlio.getTitle())
                .description(fitlio.getDescription())
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
