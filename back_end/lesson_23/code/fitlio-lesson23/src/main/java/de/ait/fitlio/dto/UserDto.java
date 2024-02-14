package de.ait.fitlio.dto;

import de.ait.fitlio.model.User;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.stream.Collectors;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class UserDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String name;
    @Column(nullable = false)
    private String email;
    @Column (nullable = false)
    @Enumerated(value = EnumType.STRING)
    private User.Role role;

    public static UserDto from (User user){
        return new UserDto(user.getId(), user.getName(), user.getEmail(), user.getRole());
        // собрать объект и вернуть его
    }
    public static List<UserDto> from(List<User> users) {
        return users.stream()
                .map(UserDto::from)
                .collect(Collectors.toList());
    }

}
