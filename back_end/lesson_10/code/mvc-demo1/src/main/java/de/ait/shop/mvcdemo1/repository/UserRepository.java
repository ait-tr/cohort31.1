package de.ait.shop.mvcdemo1.repository;

import de.ait.shop.mvcdemo1.model.User;

public interface UserRepository extends CrudRepository<User>{
    User findByEmail(String email);
}
