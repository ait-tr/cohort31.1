package de.ait.events_app.services.impl;

import de.ait.events_app.models.Event;
import de.ait.events_app.repositories.EventRepository;
import de.ait.events_app.services.EventService;

import java.time.LocalDate;
import java.util.List;

public class EventServiceImpl implements EventService {

    //DI
    private final EventRepository eventRepository;

    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }


    @Override
    public Event addEvent(String title, LocalDate date) {

        if(title == null || title == "" || title == " ") {
            throw new IllegalArgumentException("Event title can't be empty");
        }
        if(date == null) {
            throw new IllegalArgumentException("Event date can't be empty");
        }
//        if(date.isBefore(LocalDate.now())) {
//            throw new IllegalArgumentException("Event date can't be before then today");
//        }
        Event existedEvent = eventRepository.findEventByTitle(title);
        if(existedEvent != null) {
            throw new IllegalArgumentException("Event with this title already exists.");
        }
        Event event = new Event(title, date);

        eventRepository.save(event); // сохраняем событие в хранилище

        return event;
    }

    @Override
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public void updateEvent(Long id, String newTitle, LocalDate newDate) {
        // берем весь список
        List<Event> events = eventRepository.findAll();
        // находим событие по id
        Event eventForUpdate = events.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);

        if(eventForUpdate == null) {
            throw new IllegalArgumentException("Event wis id <" + id + "> not found.");
        }
        if(!newTitle.isBlank()){
            eventForUpdate.setTitle(newTitle);
        }
        if(!(newDate == null)){
            eventForUpdate.setDate(newDate);
        }

        eventRepository.update(eventForUpdate);
    }
}
