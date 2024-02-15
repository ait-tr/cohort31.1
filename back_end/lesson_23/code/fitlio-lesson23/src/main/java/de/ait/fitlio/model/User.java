package de.ait.fitlio.model;

import jakarta.persistence.*;
import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@EqualsAndHashCode
@Entity
@ToString
@Table(name = "fit_users")
public class User {
    public enum Role{
        USER,MANAGER,ADMIN
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String name;
    @Column(nullable = false)
    private String email;
    @Column (nullable = false)
    private String password;
    @Column (nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Role role;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_profile_id")
    private UserProfile userProfile;

}
