package practice.de.ait.app1;

import de.ait.app1.controllers.UserController;
import de.ait.app1.repositories.UserRepository;
import de.ait.app1.services.impl.UserServiceImpl;
import practice.de.ait.app1.repositories.impl.UserRepositoryFileImpl;

import java.util.Scanner;

public class Main {

    private static final String FILE_NAME = "/Users/leonidk/Desktop/App1-1/src/main/java/de/ait/app1/users.txt";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // DI
        // внедряем зависимости
        // UserRepository userRepository = new UserRepositoryListImpl(); // DI на лист
        UserRepository userRepository = new UserRepositoryFileImpl(FILE_NAME); // DI на репозиторий на файле
        UserServiceImpl userService = new UserServiceImpl(userRepository);
        UserController userController = new UserController(scanner, userService);

        // userController.addUser();

        boolean isRun = true;

        while (isRun) {
            System.out.println("Input command (address): ");
            String command = scanner.nextLine();

            switch (command) {
                case "/addUser" -> userController.addUser(); // вызов сервиса
                case "/users" -> userController.getAllUsers(); // вызов сервиса
                case "/exit" -> isRun = false;
            }
        }
    }
}
