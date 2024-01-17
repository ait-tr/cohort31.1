package de.ait.events_app.controllers;

import de.ait.events_app.models.Event;
import de.ait.events_app.services.EventService;

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

    public void updateEvent() {
        System.out.println("Input Event ID: ");
        Long idForUpdate = scanner.nextLong();
        // считаем пустую строку
        scanner.nextLine();

        System.out.println("Input title: ");
        String newTitle = scanner.nextLine();

        System.out.println("Input date: ");
        String str = scanner.nextLine();
        LocalDate newDate = LocalDate.parse(str);

        eventService.updateEvent (idForUpdate, newTitle, newDate);
    }
}
