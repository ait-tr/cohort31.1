package de.ait.events_app.repositories.impl;

import de.ait.events_app.models.Event;
import de.ait.events_app.repositories.EventRepository;

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
    public void update(Event event) {
        // на вход получили пользователя, нужно его данные перезаписать в файле
        // нюанс! - нельзя переписать одну строку в файле, нужно переписывать файл полностью.
        List<Event> events = findAll(); // получили все события из файла

        // находим обновляемое событие по его id
        Event eventForUpdate = events.stream()
                .filter(e -> e.getId() == event.getId())
                .findFirst()
                .orElse(null);
        // удаляем событие из списка по его id
        events.remove(eventForUpdate);
        // добавляем событие в список
        events.add(event);
        // делаем цикл, который записывает все события из списка в файл
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // начало цикла
            for (Event e : events) {
                writer.write(e.getId() + "," + e.getTitle() + "," + e.getDate());
                writer.newLine();
            }
        } catch (IOException e) {
            throw new IllegalStateException("Problem with file: " + e.getMessage());
        }

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
    public Event findEventByTitle(String title) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return reader.lines()
                    .map(line -> line.split(","))
                    .filter(parsed -> parsed[1].contains(title)) // совпадение по подстроке
                    .findFirst()
                    .map(parsed -> new Event(Long.parseLong(parsed[0]), parsed[1], LocalDate.parse(parsed[2])))
                    .orElse(null);

        } catch (IOException e) {
            throw  new IllegalStateException("Problem with file.");
        }
    }

    @Override
    public Event findEventByDate(LocalDate date) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return reader.lines()
                    .map(line -> line.split(","))
                    .filter(parsed -> LocalDate.parse(parsed[2]).equals(date))
                    .findFirst()
                    .map(parsed -> new Event(Long.parseLong(parsed[0]), parsed[1], LocalDate.parse(parsed[2])))
                    .orElse(null);

        } catch (IOException e) {
            throw  new IllegalStateException("Problem with file.");
        }
    }

}
