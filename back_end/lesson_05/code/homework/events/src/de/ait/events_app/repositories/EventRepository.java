package homework.events.src.de.ait.events_app.repositories;

import homework.events.src.de.ait.events_app.models.Event;

public interface EventRepository extends CrudRepository<Event> {

    Event findEventByTitle(String title);
}
