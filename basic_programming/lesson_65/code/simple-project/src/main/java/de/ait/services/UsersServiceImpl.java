package de.ait.services;

import de.ait.dto.UserDto;
import de.ait.models.User;
import de.ait.repositories.UsersRepository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

public class UsersServiceImpl implements UsersService {
  UsersRepository usersRepository;

  public UsersServiceImpl(UsersRepository usersRepository) {
    this.usersRepository = usersRepository;
  }

  @Override
  public List<String> getNames() {
    List<User> users = usersRepository.findAll();
    return users.stream()
        .map(User::getFirstName).toList();
  }

  @Override
  public String getSecondNameOfOldest() {
    List<User> users = usersRepository.findAll();
    String secondName =
        users.stream()
            .max((a, b) -> Integer.compare(a.getAge(), b.getAge()))
            .orElseThrow(NoSuchElementException::new)
            .getSecondName();
    return secondName;
  }

  @Override
  public void add(UserDto userDto) {
    User user = new User(
        UUID.randomUUID().toString(),
        userDto.getFirstName(),
        userDto.getSecondName(),
        userDto.getAge(),
        userDto.getHeight()
    );
    usersRepository.save(user);
  }
}
