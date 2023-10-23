package de.ait.app;

import de.ait.repositories.UsersRepository;
import de.ait.repositories.UsersRepositoryListImpl;
import de.ait.repositories.UsersRepositoryTextFileImpl;
import de.ait.services.UsersService;
import de.ait.services.UsersServiceImpl;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
//    конфигурируем приложение - с какими Impl будем работать
//    UsersRepository usersTestRepository = new UsersRepositoryListImpl();
    UsersRepository userTextFileRepository =
        new UsersRepositoryTextFileImpl("users.txt");
    UsersService usersService =
        new UsersServiceImpl(userTextFileRepository); // заменили тестовый на файловый

    while (true) {
      System.out.println("1. Вывести имена всех пользователей");
      System.out.println("2. Вывести фамилию самого старшего пользователя");
      System.out.println("3. Сохранить нового пользователя");
      System.out.println("4. Вывести средний возраст всех пользователей");
      System.out.println("5. Вывести возраст самого высокого");
      System.out.println("6. Вывести имя и фамилию самого низкого пользователя");
      System.out.println("7. Выход");
      int command = scanner.nextInt(); // считываем команду
      scanner.nextLine(); // чтобы не было бага со сканером
//    вызываем соответствующие "процессы" в нашей программе
      switch (command) {
        case 1:
          System.out.println("Выводим имена пользователей...");
          System.out.println(usersService.getNames());
          break;
        case 2:
          System.out.println("Выводим фамилию самого старшего...");
          System.out.println(usersService.getSecondNameOfOldest());
          break;
        case 3:
          System.out.println("...");
//          здесь напишем код
          break;
        case 4:
          System.out.println("...");
//          здесь напишем код
          break;
        case 5:
          System.out.println("...");
//          здесь напишем код
          break;
        case 6:
          System.out.println("...");
//          здесь напишем код
          break;
        case 7:
          System.out.println("Выходим из программы");
          System.exit(0);
          break;
        default:
          System.out.println("Нет такой команды");
      }


    }
  }
}