package de.ait.fitlio.dto;


import de.ait.fitlio.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
public class UserDto {

    private Long id;
    private String name;
    private String email;
    private User.Role role;

    public static UserDto from(User user) {
        // убрали поле password
        return new UserDto(user.getId(), user.getName(), user.getEmail(), user.getRole());
        // собрать объект и вернуть его (?)

    }

    public static List<UserDto> from(List<User> users) {
        return users.stream()
                .map(UserDto::from)
                .collect(Collectors.toList());
    }
}