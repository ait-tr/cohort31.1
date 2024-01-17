package de.ait.services;

import de.ait.dto.UserDto;

import java.util.List;

public interface UsersService {
  List<String> getNames();
  String getSecondNameOfOldest();
  void add(UserDto userDto);
}
