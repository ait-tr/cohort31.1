package de.ait.shop.mvcdemo1.service;

import de.ait.shop.mvcdemo1.model.User;

import java.util.List;

public interface UserService {
    User addUser(String name, String email, String password);
    List<User> getAllUsers();

}
