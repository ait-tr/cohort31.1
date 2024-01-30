package de.ait.apirestdemo.repository.impl;

import de.ait.apirestdemo.entity.User;
import de.ait.apirestdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class UserRepositoryFileImpl implements UserRepository {
    public final String fileName;

    public UserRepositoryFileImpl(@Value("${users.file-name}") String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<User> findAll() {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) { // открываем файл для чтения

            return reader.lines() // получаем все строки из файла
                    .map(line -> line.split(",")) // разбиваем каждую строку на массив из нескольких строк по разделителю
                    .map(parsed -> new User(parsed[0], parsed[1], parsed[2], parsed[3])) // преобразовали в пользователя
                    .collect(Collectors.toList()); // преобразовали в список

        } catch (IOException e) { // если была ошибка с файлом, сообщаем об этом и останавливаем приложение
            throw new IllegalStateException("Can't read file: " + e.getMessage());
        }

    }

    @Override
    public void save(User user) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) { // открываем файл для до-записи
            writer.write(user.getName() + "," + user.getEmail() + "," + user.getPassword() + "," + user.getRole()); // записываем его в файл
            writer.newLine(); // создаем новую строку

        } catch (IOException e) { // если была ошибка с файлом, сообщаем об этом и останавливаем приложение
            throw new IllegalStateException("Can't write to file: " + e.getMessage());
        }

    }

    @Override
    public User findOneByEmail(String email) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
            return bufferedReader.lines()
                    .map(l->l.split(","))
                    .filter(parced -> parced[1].equals(email))
                    .findFirst()
                    .map(parced-> new User(parced[0], parced[1], parced[2], parced[3]))
                    .orElse(null);
        } catch (IOException e) {
            throw new IllegalStateException("Can't read file" + e.getMessage());
        }
    }

    @Override
    public User findById(Long id) {
        return null;
    }
    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void update(User model) {

    }

}
