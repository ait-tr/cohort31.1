package de.ait.fitlio.service;

import de.ait.fitlio.dto.NewUserDto;
import de.ait.fitlio.dto.UserDto;

public interface UserService {

    UserDto addUser(NewUserDto newUser);

    //TODO список пользователей для администрирования

}
