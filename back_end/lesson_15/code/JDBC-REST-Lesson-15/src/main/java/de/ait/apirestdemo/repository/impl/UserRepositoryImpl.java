package de.ait.apirestdemo.repository.impl;

import de.ait.apirestdemo.entity.User;
import de.ait.apirestdemo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@RequiredArgsConstructor
@Repository
public class UserRepositoryImpl implements UserRepository {

    private final DataSource dataSource; // DI

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void save(User model) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void update(User model) {

    }

    @Override
    public User findOneByEmail(String email) {
        return null;
    }
}
