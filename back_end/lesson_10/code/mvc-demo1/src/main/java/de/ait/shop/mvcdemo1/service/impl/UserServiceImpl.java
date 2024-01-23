package de.ait.shop.mvcdemo1.service.impl;

import de.ait.shop.mvcdemo1.model.User;
import de.ait.shop.mvcdemo1.repository.UserRepository;
import de.ait.shop.mvcdemo1.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User addUser(String name, String email, String password) {
        User user = new User(name, email, password);
        userRepository.save(user);
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
