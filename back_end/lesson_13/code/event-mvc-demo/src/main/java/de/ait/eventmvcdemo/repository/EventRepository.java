package de.ait.eventmvcdemo.repository;

import de.ait.eventmvcdemo.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    // this is CRUD repository
}
