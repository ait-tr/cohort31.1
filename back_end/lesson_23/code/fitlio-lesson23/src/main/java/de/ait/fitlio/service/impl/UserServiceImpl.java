package de.ait.fitlio.service.impl;

import de.ait.fitlio.dto.NewUserDto;
import de.ait.fitlio.dto.UserDto;
import de.ait.fitlio.exceptions.RestException;
import de.ait.fitlio.model.User;
import de.ait.fitlio.model.UserProfile;
import de.ait.fitlio.repository.UserRepository;
import de.ait.fitlio.service.UserProfileService;
import de.ait.fitlio.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

import static de.ait.fitlio.dto.UserDto.from;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserProfileService userProfileService;
    private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    @Override
    public UserDto saveUser(NewUserDto newUser) {
        if (userRepository.existsByEmail(newUser.getEmail())) {
            throw new RestException(HttpStatus.CONFLICT,
                    "User with email <" + newUser.getEmail() + "> already exists");
        }
        User user= User.builder()
                .name(newUser.getName())
                .email(newUser.getEmail())
                .password(passwordEncoder.encode(newUser.getPassword())) // шифрование поля
                .role(User.Role.USER) // присвоили роль
                .build();
        userRepository.save(user);
        // создаем сразу новый UserProfile для пользователя
        UserProfile userProfile = userProfileService.createUserProfileForUser(user);
        user.setUserProfile(userProfile); // пользователь получает свой профиль
        User savedUser = userRepository.save(user); // сохранили еще раз user c его профилем
        return from(savedUser);
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> userList = userRepository.findAll();
        return from(userList);
    }
}
