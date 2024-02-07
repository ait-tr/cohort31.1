package de.ait.fitlio.service.impl;

import de.ait.fitlio.dto.NewUserDto;
import de.ait.fitlio.dto.UserDto;
import de.ait.fitlio.model.User;
import de.ait.fitlio.repository.UserRepository;
import de.ait.fitlio.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static de.ait.fitlio.dto.UserDto.from;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    // TODO private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public UserDto addUser(NewUserDto newUser) {
        User user = User.builder()
                .name(newUser.getName())
                .email(newUser.getEmail())
                .password(newUser.getPassword())
                .role(User.Role.USER)
                .build();
        userRepository.save(user);

        return from(user);
    }
}
