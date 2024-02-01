package de.ait.apirestdemo.service;

import de.ait.apirestdemo.dto.NewUserDto;
import de.ait.apirestdemo.dto.UpdateUserDto;
import de.ait.apirestdemo.dto.UserDto;

import java.util.List;

public interface UserService {
    // получить всех пользователей
    List<UserDto> getAllUsers(); // нужно только 3 поля (убираем поле password)

    // сохранить пользователя
    UserDto addUser(NewUserDto newUser); // нужны все поля, а их 4 - имя, емайл, пароль, роль

    UserDto getUser(Long id);

    UserDto updateUser(Long id, UpdateUserDto updateUser);

    UserDto deleteUser(Long id);

}
