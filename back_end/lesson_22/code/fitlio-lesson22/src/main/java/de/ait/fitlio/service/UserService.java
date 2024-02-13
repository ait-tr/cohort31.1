package de.ait.fitlio.service;

import de.ait.fitlio.dto.NewUserDto;
import de.ait.fitlio.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto addUser(NewUserDto newUser);

    List<UserDto> getAllUsers();
}
