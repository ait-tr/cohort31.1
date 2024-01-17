package de.ait.events_app.services.impl;

import de.ait.events_app.models.Event;
import de.ait.events_app.repositories.EventRepository;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@DisplayName("EventServiceImpl is working...")
@DisplayNameGeneration(value = DisplayNameGenerator.ReplaceUnderscores.class)
class EventServiceImplTest {
    // создадим необходимые константы
    private static final String EXISTED_EVENT_TITLE = "New Year";
    private static final String NOT_EXISTED_EVENT_TITLE = "Old New Year";
    private static final LocalDate DEFAULT_DATE = LocalDate.of(2024,01,01);
    private static final Event EXISTED_Event = new Event(EXISTED_EVENT_TITLE, DEFAULT_DATE);
    private static final Event NOT_EXISTED_Event = new Event(NOT_EXISTED_EVENT_TITLE, DEFAULT_DATE);

    private EventServiceImpl eventService;
    private EventRepository eventRepository;

    @BeforeEach
    public void setUp(){
        // заглушка для репозитория
        eventRepository = Mockito.mock(EventRepository.class);

        // прописываем явно поведение методов из сервиса
        when(eventRepository.findEventByTitle(EXISTED_EVENT_TITLE)).thenReturn(EXISTED_Event);
        when(eventRepository.findEventByTitle(NOT_EXISTED_EVENT_TITLE)).thenReturn(null);

        this.eventService = new EventServiceImpl(eventRepository);
    }
    // два теста ниже проверят правильное поведение при пустых title и data
    @Test
    public void addEvent_on_incorrect_title_throws_exception(){
        assertThrows(IllegalArgumentException.class, () -> eventService.addEvent(null, DEFAULT_DATE));
    }

    @Test
    public void addEvent_on_incorrect_data_throws_exception(){
        assertThrows(IllegalArgumentException.class, () -> eventService.addEvent(EXISTED_EVENT_TITLE, null));
    }

    // проверим логику на уже существующее событие и создаваемое
    @Test
    public void on_existed_event_throw_exception (){
        assertThrows(IllegalArgumentException.class, () -> eventService.addEvent(EXISTED_EVENT_TITLE, DEFAULT_DATE));
    }

    @Test
    public void return_created_user (){
        Event actual = eventService.addEvent(NOT_EXISTED_EVENT_TITLE, DEFAULT_DATE);
        verify(eventRepository).save(NOT_EXISTED_Event); // просим репозиторий сохранить новое событие

        assertNotNull(actual); // addUser вернет нам не null, а это значит, что метод отработал
    }
}