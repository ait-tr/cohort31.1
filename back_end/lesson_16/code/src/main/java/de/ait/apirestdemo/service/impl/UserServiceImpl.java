package de.ait.apirestdemo.service.impl;

import de.ait.apirestdemo.dto.NewUserDto;
import de.ait.apirestdemo.dto.UpdateUserDto;
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

    @Override
    public UserDto getUser(Long id) {
        return from(userRepository.findById(id));
    }

    @Override
    public UserDto updateUser(Long id, UpdateUserDto updateUser) {
        User userForUpdate = userRepository.findById(id);
        userForUpdate.setName(updateUser.getName());
        userForUpdate.setEmail(updateUser.getEmail());
        userForUpdate.setPassword(updateUser.getPassword());
        userForUpdate.setRole(updateUser.getRole());
        // возвращаем без пароля
        return from(userForUpdate);
    }

    @Override
    public UserDto deleteUser(Long id) {
        // получаем пользователя по его id
        User userForDelete = userRepository.findById(id);
        // удаляем
        userRepository.deleteById(id);
        return from(userForDelete);
    }
}
