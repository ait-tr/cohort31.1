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
        CARDIO, CALORIE, POWER, GAME, GENERAL
    }
    // поля и аннотации
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 200)
    private String title; // хорошо ды иметь автогенерацию названия, иначе его надо буде придумывать
    @Column(nullable = true, length = 1000)
    private String description; // пользователь опишет здесь свою тренировку словами
    @Column
    private int timeMinute; // сколько минут, time_minute
    @Column
    private int timeHour; // cколько часов, time_hour
    @Column(nullable = false)
    private LocalDate date; // когда была тренировка
    @Column
    private int calorie; // сколько потрачено калорий
    @Column
    private int distance; // какая длина дистанции, в том числе и 0
    @Enumerated(value = EnumType.STRING)
    private FitType fitType;
}
