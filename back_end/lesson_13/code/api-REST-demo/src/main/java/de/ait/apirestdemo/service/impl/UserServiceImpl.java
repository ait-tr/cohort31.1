package de.ait.apirestdemo.service.impl;

import de.ait.apirestdemo.dto.NewUserDto;
import de.ait.apirestdemo.dto.UserDto;
import de.ait.apirestdemo.entity.User;
import de.ait.apirestdemo.repository.UserRepository;
import de.ait.apirestdemo.repository.impl.UserRepositoryFileImpl;
import de.ait.apirestdemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static de.ait.apirestdemo.dto.UserDto.from;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<UserDto> getAllUsers() {
        return null;
    }

    @Override
    public UserDto addUser(NewUserDto newUser) {
        return null;
    }
}
