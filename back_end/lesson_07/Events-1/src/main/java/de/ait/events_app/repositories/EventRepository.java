package de.ait.events_app.repositories;

import de.ait.events_app.models.Event;

import java.time.LocalDate;

public interface EventRepository extends CrudRepository<Event> {

    Event findEventByTitle(String title);
    Event findEventByDate(LocalDate date);


}
