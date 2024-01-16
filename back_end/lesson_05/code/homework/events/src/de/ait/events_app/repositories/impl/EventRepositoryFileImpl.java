package homework.events.src.de.ait.events_app.repositories.impl;

import homework.events.src.de.ait.events_app.models.Event;
import homework.events.src.de.ait.events_app.repositories.EventRepository;

import java.io.*;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class EventRepositoryFileImpl implements EventRepository {

    private final String fileName;
    private Long generatedId = 1L; // id

    public EventRepositoryFileImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void save(Event event) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            event.setId(findAll().size() + generatedId); // считаем длину списка и добавляем generatedId = 1L
            writer.write(event.getId() + "," + event.getTitle() + "," + event.getDate());
            writer.newLine();
            writer.flush(); // толкаем запись
            writer.close();

        } catch (IOException e) {
            throw new IllegalStateException("Problem with file." + e.getMessage());
        }
        // generatedId++; // не нужно, так как в строке 23 корректно считаем id добавляемого события
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void updateById(Long id) {

    }

    @Override
    public List<Event> findAll() {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return reader.lines()
                    .map(line -> line.split(","))
                    .map(parsed -> new Event(Long.parseLong(parsed[0]), parsed[1], LocalDate.parse(parsed[2])))
                    .collect(Collectors.toList());

        } catch (IOException e){
            throw  new IllegalStateException("Problem with file.");
        }
    }

    @Override
    public Event findById(Long id) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return reader.lines()
                    .map(line -> line.split(","))
                    .filter(parsed -> Long.parseLong(parsed[0]) == id)
                    .findFirst()
                    .map(parsed -> new Event(Long.parseLong(parsed[0]), parsed[1], LocalDate.parse(parsed[2])))
                    .orElse(null);

        } catch (IOException e) {
            throw  new IllegalStateException("Problem with file.");
        }

    }

    @Override
    public Long quantity() {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            Long q = reader.lines()
                    .count();
            return q;
        } catch (IOException e) {
            throw new IllegalStateException("Problem with file.");
        }
    }
    @Override
    public Event findEventByTitle(String title) {
        return null;
    }

}
