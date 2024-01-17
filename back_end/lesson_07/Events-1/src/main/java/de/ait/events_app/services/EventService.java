package de.ait.events_app.services;

import de.ait.events_app.models.Event;

import java.time.LocalDate;
import java.util.List;

public interface EventService {

    Event addEvent(String title, LocalDate date);
    List<Event> getAllEvents();

    void updateUser(Long id, String newTitle, LocalDate newDate);
}
