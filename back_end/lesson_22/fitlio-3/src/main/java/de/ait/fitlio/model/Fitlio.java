package de.ait.fitlio.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Builder
@Entity
@Table (name = "fitlio")
public class Fitlio {

    public enum FitType{
        CARDIO, CALORIE, POWER, GAME, GENERAL, STAMINA, OTHER
    }
    // поля и аннотации
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 200)
    private String title; // хорошо ды иметь автогенерацию названия, иначе его надо буде придумывать
    @Column(nullable = true, length = 1000)
    private String description; // пользователь опишет здесь свою тренировку словами
    @Column(nullable = false)
    private LocalDate date; // когда была тренировка
    @Column
    private Integer timeMinute; // сколько минут, time_minute
    @Column
    private Integer timeHour; // cколько часов, time_hour
    @Column
    private Integer calorie; // сколько потрачено калорий
    @Column
    private Integer distance; // какая длина дистанции, в том числе и 0
    @Enumerated(value = EnumType.STRING)
    private FitType fitType;
}
