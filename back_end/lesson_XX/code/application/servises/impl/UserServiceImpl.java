package de.ait.application.servises.impl;

import de.ait.application.models.User;
import de.ait.application.repositories.UserRepository;
import de.ait.application.servises.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserRepository usersRepository; // зависимость на хранилище пользователей

    public UserServiceImpl(UserRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public User addUser(String email, String password) {
        if (email == null || email.equals("") || email.equals(" ")) { // валидируем email
            throw new IllegalArgumentException("Email не может быть пустым");
        }

        if (password == null || password.equals("") || password.equals(" ")) { // валидируем password
            throw new IllegalArgumentException("Password не может быть пустым");
        }

        User existedUser = usersRepository.findByEmail(email); // находим пользователя по email

        if (existedUser != null) { // если такой пользователь уже есть
            throw new IllegalArgumentException("Пользователь с таким email уже есть");
        }

        User user = new User(email, password); // создаем пользователя

        usersRepository.save(user); // сохраняем пользователя в хранилище

        return user; // возвращаем пользователя как результат
    }
    public List<User> getAllUsers() {
        return usersRepository.findAll(); // никакой дополнительной логики нет, просто запрашиваем у репозитория
    }

}
