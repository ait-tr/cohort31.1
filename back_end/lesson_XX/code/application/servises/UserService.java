package de.ait.application.servises;

import de.ait.application.models.User;

import java.util.List;

public interface UserService {
    User addUser(String email, String password);

    List<User> getAllUsers();
}
