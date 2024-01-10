package de.ait.application.controllers;

import de.ait.application.models.User;
import de.ait.application.servises.impl.UserServiceImpl;

import java.util.List;
import java.util.Scanner;

public class UserController {
    private final Scanner scanner; // поле для считывания данных с консоли с помощью Scanner
    private final UserServiceImpl usersService; // зависимость на бизнес-логику регистрации

    public UserController(Scanner scanner, UserServiceImpl usersService) {
        this.scanner = scanner;
        this.usersService = usersService;
    }


    public void addUser() { // метод регистрации - обертка над аналогичным методом сервиса, но + считывание данных и их вывод

        // считываем с клавиатуры необходимые данные
        System.out.println("Input e-mail: ");
        String email = scanner.nextLine();

        System.out.println("Input password: ");
        String password = scanner.nextLine();
        User user = usersService.addUser(email , password); // вызвали соответствующий метод сервиса
        System.out.println(user); // вывели результат
    }

    public void getAllUsers() { // метод для получения всех пользователей
        List<User> users = usersService.getAllUsers(); // запрашиваем у бизнес-логики всех пользователей
        System.out.println(users); // выводим в консоль
    }

}
