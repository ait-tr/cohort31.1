package de.ait.repositories;

import de.ait.models.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UsersRepositoryTextFileImpl implements UsersRepository {
  String fileName;

  public UsersRepositoryTextFileImpl(String fileName) {
    this.fileName = fileName;
  }

  @Override
  public List<User> findAll() {
    List<User> users = new ArrayList<>();
//    try-with-resources
    try (FileReader fileReader = new FileReader(fileName);
         BufferedReader bufferedReader = new BufferedReader(fileReader)) {
      String line = bufferedReader.readLine();
      while (line != null){
        User user = parseLine(line);
        users.add(user);
        line = bufferedReader.readLine();
      }
    } catch (IOException e) {
      System.out.println("Произошла ошибка");
    }
    return users;
  }

  public static User parseLine(String line) {
    String[] parsed = line.split("\\|");
    String firstName = parsed[0];
    String secondName = parsed[1];
    int age = Integer.parseInt(parsed[2]);
    double height = Double.parseDouble(parsed[3]);
    return new User(firstName, secondName, age, height);
  }
}
