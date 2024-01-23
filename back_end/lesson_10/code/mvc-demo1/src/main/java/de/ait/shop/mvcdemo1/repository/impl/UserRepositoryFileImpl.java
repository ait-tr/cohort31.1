package de.ait.shop.mvcdemo1.repository.impl;

import de.ait.shop.mvcdemo1.model.User;
import de.ait.shop.mvcdemo1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

//   - UserRepositoryFileImpl - делаем имплементацию главных (самых нужных на 1-м этапе) методов:
//        - save
//        - findAll

@Repository
public class UserRepositoryFileImpl implements UserRepository {

    // имя файла
    private final String fileName; // DI

    public UserRepositoryFileImpl(@Value("${users.file-name}") String fileName) {
        this.fileName = fileName;
    }


    @Override
    public void save(User user) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))){
            writer.write(user.getName() + "," + user.getEmail() + "," + user.getPassword());
            writer.newLine();
            writer.flush();

        } catch (IOException e) {
            throw new IllegalStateException("Problem with file" + e.getMessage());
        }
    }

    @Override
    public List<User> findAll() {
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return reader.lines()
                    .map(line -> line.split(","))
                    .map(parsed -> new User(parsed[0], parsed[1],parsed[2]))
                    .collect(Collectors.toList());

        } catch (IOException e){
            throw new IllegalStateException("Problem with reading file." + e.getMessage());
        }
    }

    @Override
    public void delete(User model) {

    }

    @Override
    public void update(User model) {

    }

    @Override
    public User findByEmail(String email) {
        return null;
    }
}
