package de.ait.apirestdemo.dto;

import de.ait.apirestdemo.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private String name;
    private String email;
    private String role;

    // этот метод из полей пользователя собирает нужные поля (без пароля)
    // возвращает объект типа UserDto
    public static UserDto from(User user){
       return new UserDto(user.getName(), user.getEmail(), user.getRole());
    }

    // этот метод собирает объекты типа UserDto в список, получая на вход список пользователей
    // со всеми их полями
    public List<UserDto> from(List<User> users) {
        return users.stream()
                .map(UserDto::from)
                .collect(Collectors.toList());
    }

}
