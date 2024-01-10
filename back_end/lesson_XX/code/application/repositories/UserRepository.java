package de.ait.application.repositories;

import de.ait.application.models.User;

public interface UserRepository extends CrudRepository<User>{

    User findByEmail(String email);

}
