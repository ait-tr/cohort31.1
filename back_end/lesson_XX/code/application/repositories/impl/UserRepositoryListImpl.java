package de.ait.application.repositories.impl;

import de.ait.application.models.User;
import de.ait.application.repositories.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryListImpl implements UserRepository {

    private final List<User> users = new ArrayList<>();

    private Long generatedId = 1L;

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users);
    }

    @Override
    public void save(User user) {
        users.add(user); // положили в хранилище
        user.setId(generatedId); // установили ID
        generatedId++; // увеличили ID на 1
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void updateById(User model) {

    }

    @Override
    public User findByEmail(String email) {
        return users.stream()
                .filter(user -> user.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }
}
