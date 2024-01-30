package de.ait.apirestdemo.service;

import de.ait.apirestdemo.dto.NewUserDto;
import de.ait.apirestdemo.dto.UserDto;
import de.ait.apirestdemo.entity.User;

import java.util.List;

public interface UserService {
    // получить всех пользователей
    List<UserDto> getAllUsers(); // нужно только 3 поля (убираем поле password)

    // сохранить пользователя
    User addUser(NewUserDto newUser); // нужны все поля, а их 4 - имя, емайл, пароль, роль

}
