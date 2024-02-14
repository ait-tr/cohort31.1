package de.ait.fitlio.dto;

import de.ait.fitlio.model.Fitlio;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Schema()
public class FitlioDto {
    private Long id;
    private String title;
    private String description;
    private Integer timeMinute;
    private Integer timeHour;
    private String date;
    private Integer calorie;
    private Integer distance;
    private String fitType;
    public static FitlioDto from(Fitlio fitlio) {
        return FitlioDto.builder()
                .id(fitlio.getId())
                .date(fitlio.getDate().toString())
                .title(fitlio.getTitle())
                .description(fitlio.getDescription())
                .timeMinute(fitlio.getTimeMinute())
                .timeHour(fitlio.getTimeHour())
                .calorie(fitlio.getCalorie())
                .distance(fitlio.getDistance())
                .fitType(fitlio.getFitType().toString())
                .build();
    }
    public static List<FitlioDto> from (List<Fitlio> fitlios){
        return fitlios.stream()
                .map(FitlioDto::from)
                .collect(Collectors.toList());
    }
}
