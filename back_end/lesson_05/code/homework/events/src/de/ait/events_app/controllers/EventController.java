package homework.events.src.de.ait.events_app.controllers;

import homework.events.src.de.ait.events_app.models.Event;
import homework.events.src.de.ait.events_app.services.EventService;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class EventController {

    // DI
    private final Scanner scanner;
    private final EventService eventService;


    public EventController(Scanner scanner, EventService eventService) {
        this.scanner = scanner;
        this.eventService = eventService;
    }

    public void addEvent(){

        System.out.println("Input title: ");
        String title = scanner.nextLine();

        System.out.println("Input date: ");
        String dateStr = scanner.nextLine();

        LocalDate date = LocalDate.parse(dateStr);

        Event event = eventService.addEvent(title, date);
        System.out.println(event);
    }

    public void getAllEvents(){
        List<Event> eventList = eventService.getAllEvents();
        System.out.println(eventList);
    }

}
