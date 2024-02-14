package de.ait.fitlio.repository;

import de.ait.fitlio.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {

    // findByEmail - есть ли он?
    Optional<User> findByEmail(String email);

}
