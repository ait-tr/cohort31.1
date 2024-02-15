package de.ait.fitlio.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@EqualsAndHashCode
@ToString
@Table(name = "fitlio")
public class Fitlio {
    public enum FitType {
        CARDIO, CALORIE, POWER, GAME, GENERAL, STAMINA, OTHER
    }

    // поля и аннотации
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 200)
    private String title;  // хорошо бы иметь автогенерацию названия. иначе его надо будет придумывать
    @Column(nullable = true, length = 1000)
    private String description; // пользователь опишет свою тренировку словами
    @Column(nullable = false)
    private LocalDate date; // когда была тренировка
    @Column
    private Integer timeMinute; // сколько минут, time_minute
    @Column
    private Integer timeHour; // сколько часов длилась
    @Column
    private Integer calorie; // потрачено калорий
    @Column
    private Integer distance; // преодоленная дистанция, в т.ч. 0

    @Enumerated(value = EnumType.STRING)
    private FitType fitType;

    // TODO
    // проставить связь с пользователем

}
