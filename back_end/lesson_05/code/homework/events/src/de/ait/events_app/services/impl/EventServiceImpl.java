package homework.events.src.de.ait.events_app.services.impl;

import homework.events.src.de.ait.events_app.models.Event;
import homework.events.src.de.ait.events_app.repositories.EventRepository;
import homework.events.src.de.ait.events_app.services.EventService;

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

        if(date.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Event date can't be before then today");
        }

        Event existedEvent = eventRepository.findEventByTitle(title);
        if(existedEvent != null) {
            throw new IllegalArgumentException("Event with this title already exists.");
        }

        Event event = new Event(title, date);

        eventRepository.save(event); // сохраняем пользователя в хранилище

        return event;
    }

    @Override
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }
}
