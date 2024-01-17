package de.ait.events_app.repositories.impl;

import de.ait.events_app.models.Event;
import de.ait.events_app.repositories.EventRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EventRepositoryListImpl implements EventRepository {

    private List<Event> eventList = new ArrayList<>(); // хранилище
    private Long generatedId = 1L; // id


    @Override
    public void save(Event event) {
        eventList.add(event);
        event.setId(generatedId);
        generatedId++;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void update(Event model) {

    }

    @Override
    public Event findById(Long id) {
        return eventList.stream()
                .filter(event -> event.getId().longValue() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Event> findAll() {
        return new ArrayList<Event>(eventList);
    }

    @Override
    public Event findEventByTitle(String title) {
        return eventList.stream()
                .filter(event -> event.getTitle().equalsIgnoreCase(title))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Event findEventByDate(LocalDate date) {
        return null;
    }

}
