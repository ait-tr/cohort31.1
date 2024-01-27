package de.ait.eventmvcdemo.controller;

import de.ait.eventmvcdemo.entity.Event;
import de.ait.eventmvcdemo.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    @GetMapping("/events")
    public String getEventsPage(Model model){
        Iterable<Event> events = eventRepository.findAll();
        model.addAttribute("events", events);
        return "events";
    }

    @GetMapping("/event/add")
    public String addEventPage(Model model){
        return "event-add";
    }

    @PostMapping("/event/add")
    public String addEventForm(@RequestParam("title") String title,
                               @RequestParam("description") String description,
                               @RequestParam("date") LocalDate date){
        Event event = new Event(title, description, date);
        eventRepository.save(event);
        return "redirect:/events";
    }

    @GetMapping("/event/{id}")
    public String eventDetails(@PathVariable(value = "id") Long id, Model model){
        if(!eventRepository.existsById(id)){
            System.out.println("Not event with id: <" + id + ">");
        }
        Optional<Event> event = eventRepository.findById(id);
        List<Event> res = new ArrayList<>();
        event.ifPresent(res::add);
        model.addAttribute("event", res);
        return "event-details";
    }

}
