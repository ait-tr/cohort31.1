package de.ait.services;

import de.ait.repositories.UsersRepositoryListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UsersServiceImplTest {
  private UsersServiceImpl usersService;

  @BeforeEach
  void setUp() {
    usersService = new UsersServiceImpl(
        new UsersRepositoryListImpl());
  }

  @Test
  void getNames() {
    List<String> actual = usersService.getNames();
    List<String> expected = List.of(
        "Alisher", "TestName1", "TestName2");
    assertEquals(expected, actual);
  }

  @Test
  void getSecondNameOfOldest() {
  }
}