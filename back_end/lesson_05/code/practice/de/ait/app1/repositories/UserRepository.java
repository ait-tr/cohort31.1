package practice.de.ait.app1.repositories;

import de.ait.app1.models.User;
import de.ait.app1.repositories.CrudRepository;

public interface UserRepository extends CrudRepository<User> {

    User findByEmail(String email); // ищем пользователя по его email

}
