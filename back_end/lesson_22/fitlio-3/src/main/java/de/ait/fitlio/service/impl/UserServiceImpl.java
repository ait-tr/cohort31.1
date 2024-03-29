package de.ait.fitlio.service.impl;

import de.ait.fitlio.dto.NewUserDto;
import de.ait.fitlio.dto.UserDto;
import de.ait.fitlio.model.User;
import de.ait.fitlio.repository.UserRepository;
import de.ait.fitlio.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static de.ait.fitlio.dto.UserDto.from;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public UserDto addUser(NewUserDto newUser) {
        User user = User.builder()
                .name(newUser.getName())
                .email(newUser.getEmail())
                .password(passwordEncoder.encode(newUser.getPassword())) // шифрование пароля
                .role(User.Role.USER) // присвоили роль
                .build();
        userRepository.save(user);
        return from(user);
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> userList = userRepository.findAll();
        return from(userList);
    }
}
