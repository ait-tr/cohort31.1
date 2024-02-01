package de.ait.apirestdemo.repository.impl;

import de.ait.apirestdemo.entity.User;
import de.ait.apirestdemo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Repository
public class UserRepositoryJdbcImpl implements UserRepository {


    private static final String SQL_SELECT_BY_ID = "select * from users where id = ?";
    private static final String SQL_UPDATE_BY_ID = "update users set name = ?, set email = ?, set password = ?, set role = ?";
    private static final String SQL_SELECT_ALL = "select * from users";
    private static final String SQL_FIND_BY_EMAIL = "select * from users where email = ?";

    private final DataSource dataSource; // DI

    private final JdbcTemplate jdbcTemplate; // DI

    private static final RowMapper<User> USER_ROW_MAPPER = (row, rowNumber) -> {
      Long id = row.getLong("id");
      String name = row.getString("name");
      String email = row.getString("email");
      String password = row.getString("password");
      String role = row.getString("role");

      return User.builder()
              .id(id)
              .name(name)
              .email(email)
              .password(password)
              .role(role)
              .build();
    };


    @Override
    public User findById(Long id) {
        return jdbcTemplate.queryForObject(SQL_SELECT_BY_ID, USER_ROW_MAPPER, id);
    }

    @Override
    public List<User> findAll() {
        return jdbcTemplate.query(SQL_SELECT_ALL, USER_ROW_MAPPER);
    }

    @Override
    public void save(User user) {
        // создать объект и передадим в INSERT - запрос
        SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(dataSource)
                .usingGeneratedKeyColumns("id");

        jdbcInsert.withTableName("USERS"); // указываем таблицу, куда будем вставлять

        Map< String, Object> parameters = new HashMap<>();
        parameters.put("name", user.getName());
        parameters.put("email", user.getEmail());
        parameters.put("password", user.getPassword());
        parameters.put("role", user.getRole());

        Long generatedId = jdbcInsert.executeAndReturnKey(parameters).longValue(); // запрос к БД и получение нового id
        user.setId(generatedId); // проставили у нового пользователя id из базы данных

    }

    @Override
    public User deleteById(Long id) {
        return jdbcTemplate.queryForObject(SQL_SELECT_BY_ID, USER_ROW_MAPPER, id);
    }

    @Override
    public void update(User user) {
        jdbcTemplate.update(SQL_UPDATE_BY_ID, user.getName(), user.getEmail(), user.getPassword(),user.getRole());
    }

    @Override
    public User findOneByEmail(String email) {
        return jdbcTemplate.queryForObject(SQL_FIND_BY_EMAIL, USER_ROW_MAPPER, email);
    }
}
