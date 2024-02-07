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
@Table(name = "fit_users_profile")
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50, nullable = false)
    private String firstName;
    @Column(length = 100, nullable = false)
    private String lastName;
    @Column
    private boolean gender;
    @Column
    private LocalDate dateOfBirth; // возраст вычисляем
    @Column
    private double weight; // вес
    @Column
    private int height; // рост
    @Column
    private boolean allowance; // наличие допуска

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;
}
