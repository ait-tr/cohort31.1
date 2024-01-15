package homework.events.src.de.ait.events_app;

import homework.events.src.de.ait.events_app.controllers.EventController;
import homework.events.src.de.ait.events_app.repositories.EventRepository;
import homework.events.src.de.ait.events_app.repositories.impl.EventRepositoryFileImpl;
import homework.events.src.de.ait.events_app.repositories.impl.EventRepositoryListImpl;
import homework.events.src.de.ait.events_app.services.impl.EventServiceImpl;

import java.util.Scanner;

public class Main {

    private static final String FILE_NAME = "back_end/lesson_05/code/homework/events/src/de/ait/events_app/events.txt";

    public static void main(String[] args) {

        // DI
        Scanner scanner = new Scanner(System.in);
        EventRepository eventRepositoryList = new EventRepositoryListImpl();
        EventRepository eventRepositoryFile = new EventRepositoryFileImpl(FILE_NAME);
        // EventServiceImpl eventService = new EventServiceImpl(eventRepositoryList);
        EventServiceImpl eventService = new EventServiceImpl(eventRepositoryFile); // подключаем сервис с другим репозиторием
        EventController eventController = new EventController(scanner, eventService);

        boolean isRun = true;
        Long generatedId = eventRepositoryFile.quantity();
        System.out.println( generatedId + " events in list.");

        while(isRun) {
            System.out.println("Input command (address): ");
            String command = scanner.nextLine();

            switch (command){
                case "/addEvent" -> eventController.addEvent();
                case "/events" -> eventController.getAllEvents();
                case "/exit" -> isRun = false;
            }
        }
    }
}
