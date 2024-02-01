package de.ait.apirestdemo.service.impl;

import de.ait.apirestdemo.dto.NewUserDto;
import de.ait.apirestdemo.dto.UserDto;
import de.ait.apirestdemo.entity.User;
import de.ait.apirestdemo.repository.UserRepository;
import de.ait.apirestdemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static de.ait.apirestdemo.dto.UserDto.from;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<UserDto> getAllUsers() {

        return from(userRepository.findAll()); // метод from из класса UserDto
    }

    @Override
    public UserDto addUser(NewUserDto newUser) {
        // создаем пользователя со всеми полями от newUser
        //User user = new User (newUser.getName(), newUser.getEmail(), newUser.getPassword(), newUser.getRole());

        User user = User.builder()
                .name(newUser.getName())
                .email(newUser.getEmail())
                .password(newUser.getPassword())
                .role(newUser.getRole())
                .build();

        // сохраняем его в репозитории
        userRepository.save(user);
        // возвращаем(показываем) пользователя, но без пароля
        return from(user);
    }
}
