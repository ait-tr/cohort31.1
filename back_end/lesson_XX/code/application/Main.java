package de.ait.application;

import de.ait.application.controllers.UserController;
import de.ait.application.repositories.UserRepository;
import de.ait.application.repositories.impl.UserRepositoryListImpl;
import de.ait.application.servises.impl.UserServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserRepository userRepository = new UserRepositoryListImpl();
        UserServiceImpl userService = new UserServiceImpl(userRepository);
        UserController userController = new UserController(scanner, userService);

        // userController.addUser();

        boolean isRun = true;

        while (isRun) {
            System.out.println("Input command: ");
            String command = scanner.nextLine(); // считываем команду

            switch (command) {
                case "/addUser" ->  // если это команда на регистрацию
                        userController.addUser(); // регистрируем пользователя
                case "/users" ->  // если это команда на получение пользователей
                        userController.getAllUsers();
                case "/exit" -> isRun = false;
            }
        }
    }
}
