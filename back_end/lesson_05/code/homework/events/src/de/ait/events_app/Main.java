package homework.events.src.de.ait.events_app;

import homework.events.src.de.ait.events_app.controllers.EventController;
import homework.events.src.de.ait.events_app.repositories.EventRepository;
import homework.events.src.de.ait.events_app.repositories.impl.EventRepositoryListImpl;
import homework.events.src.de.ait.events_app.services.impl.EventServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // DI
        EventRepository eventRepository = new EventRepositoryListImpl();
        EventServiceImpl eventService = new EventServiceImpl(eventRepository);
        EventController eventController = new EventController(scanner, eventService);

        boolean isRun = true;

        while(isRun) {
            System.out.println("Input command (address): ");
            String command = scanner.nextLine();

            switch (command){
                case "/addEvent" -> eventController.addEvent();
                case "events" -> eventController.getAllEvents();
                case "/exit" -> isRun = false;
            }
        }
    }
}
