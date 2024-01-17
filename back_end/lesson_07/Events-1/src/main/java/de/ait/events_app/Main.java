package de.ait.events_app;

import de.ait.events_app.controllers.EventController;
import de.ait.events_app.repositories.EventRepository;
import de.ait.events_app.repositories.impl.EventRepositoryFileImpl;
import de.ait.events_app.repositories.impl.EventRepositoryListImpl;
import de.ait.events_app.services.impl.EventServiceImpl;

import java.util.Scanner;

public class Main {

    private static final String FILE_NAME = "/Users/leonidk/Desktop/Events/src/de/ait/events_app/events.txt";

    public static void main(String[] args) {

        // DI
        Scanner scanner = new Scanner(System.in);
        EventRepository eventRepositoryList = new EventRepositoryListImpl();
        EventRepository eventRepositoryFile = new EventRepositoryFileImpl(FILE_NAME);
        // EventServiceImpl eventService = new EventServiceImpl(eventRepositoryList);
        EventServiceImpl eventService = new EventServiceImpl(eventRepositoryFile); // подключаем сервис с другим репозиторием
        EventController eventController = new EventController(scanner, eventService);

        boolean isRun = true;

        while(isRun) {
            System.out.println("Input command (address): ");
            String command = scanner.nextLine();

            switch (command){
                case "/addEvent" -> eventController.addEvent();
                case "/events" -> eventController.getAllEvents();
                case "/updateEvent" -> eventController.updateEvent();
                case "/exit" -> isRun = false;
            }
        }
    }
}
