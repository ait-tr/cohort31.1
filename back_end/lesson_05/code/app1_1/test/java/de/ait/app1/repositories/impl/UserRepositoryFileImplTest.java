package de.ait.app1.repositories.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("UserRepoFileImpl is working...")
@DisplayNameGeneration(value = DisplayNameGenerator.ReplaceUnderscores.class)
class UserRepositoryFileImplTest {
    // константа - имя файла
    private static final String TEMP_USERS_FILE_NAME = "users_test.txt";

    private UserRepositoryFileImpl userRepository; // DI step 1 (объявили, но не создали)

    @BeforeEach
    public void setup() throws IOException {
        createNewUserFileForTest(TEMP_USERS_FILE_NAME); // файл создаем
        userRepository = new UserRepositoryFileImpl(TEMP_USERS_FILE_NAME); // DI step 2
    }

    private void createNewUserFileForTest(String fileName) throws IOException {
        File file = new File(fileName);

        deleteIfExists(file); // удалили, если уже есть такой

        boolean result = file.createNewFile(); // создаем новый файл
        if(!result) {
            throw new IllegalStateException("Problem with file. Can't create.");
        }
    }

    private void deleteIfExists(File file) {
        if(file.exists()){
            boolean result = file.delete();

            if(!result){
                throw new IllegalStateException("Problem with file. Can't delete.");
            }
        }
    }

}