package de.ait.apirestdemo.repository;

import de.ait.apirestdemo.entity.User;

public interface UserRepository extends CrudRepository<User>{
    User findOneByEmail(String email);
}
