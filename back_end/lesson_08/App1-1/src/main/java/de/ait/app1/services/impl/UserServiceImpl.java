package de.ait.app1.services.impl;

import de.ait.app1.models.User;
import de.ait.app1.repositories.UserRepository;
import de.ait.app1.services.UserService;
import de.ait.app1.validation.EmailValidator;
import de.ait.app1.validation.PasswordValidator;

import java.util.List;

public class UserServiceImpl implements UserService {

    // dependency injection
    public final UserRepository userRepository; // зависимость на UserRepository
    // добавляем зависимость на валидаторы, так как это часть бизнес-логики
    private final EmailValidator emailValidator;
    private final PasswordValidator passwordValidator;

    // constructor
    public UserServiceImpl(UserRepository userRepository, EmailValidator emailValidator, PasswordValidator passwordValidator) {
        this.userRepository = userRepository; // DI
        this.emailValidator = emailValidator; // DI
        this.passwordValidator = passwordValidator; // внедрение зависимости
    }

    // бизнес-логика
    // 1-й метод
    @Override
    public User addUser(String email, String password) {
        // валидация email
//        if(email == null || email == "" || email.equals(" ")) {
//            throw new IllegalArgumentException("Email can't be empty");
//        }
        emailValidator.validate(email);

        // валидация password
//        if(password == null || password == "" || password.equals(" ")) {
//            throw new IllegalArgumentException("Password can't be empty");
//        }
        passwordValidator.validate(password);

        // проверить, что такого пользователя еще нет
        User existedUser = userRepository.findByEmail(email);
        if(existedUser != null) {
            throw new IllegalArgumentException("User already exists.");
        }

        User user = new User(email, password);

        userRepository.save(user); // сохранить пользователя

        return user;

    }

    // 2-й метод
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // 3-й метод
    public User updateUser(Long id, String newEmail, String newPassword) {
        // берем весь список
        List<User> users = userRepository.findAll();
        // находим пользователя по id
        User userForUpdate = users.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElse(null);
        if(userForUpdate == null) {
            throw new IllegalArgumentException("User wis id <" + id + "> not found.");
        }
        if(!newEmail.isBlank()){
            userForUpdate.setEmail(newEmail);
        }
        if(!newPassword.isBlank()){
            userForUpdate.setPassword(newPassword);
        }
        userRepository.update(userForUpdate);

        return userForUpdate;
    }

}
