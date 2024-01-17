package de.ait.events_app.repositories.impl;

import de.ait.events_app.models.Event;
import de.ait.events_app.repositories.EventRepository;
import org.junit.jupiter.api.*;

import java.io.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("EventRepoFileImpl is working...")
@DisplayNameGeneration(value = DisplayNameGenerator.ReplaceUnderscores.class)
class EventRepositoryFileImplTest {
    private static final String TEMP_EVENTS_FILE_NAME = "events_test.txt";

    private EventRepositoryFileImpl eventRepository;

    @BeforeEach
    public void setup() throws IOException {
        createNewFileForTest(TEMP_EVENTS_FILE_NAME);
        eventRepository = new EventRepositoryFileImpl(TEMP_EVENTS_FILE_NAME);
    }

    @AfterEach
    public void tearDown(){
        deleteFileAfterTest(TEMP_EVENTS_FILE_NAME);
    }

    @DisplayName("save event")
    @Nested
    class saveTest{
        @Test
        public void write_correct_line_to_file() throws IOException {
            //создаем пользователя
            Event event = new Event("New Year", LocalDate.of(2024,01,01));
            String expectedStr = "1,New Year,2024-01-01";
            // пишем его в файл c помощью репозитория
            eventRepository.save(event);
            // прочитаем его из файла
            BufferedReader reader = new BufferedReader(new FileReader(TEMP_EVENTS_FILE_NAME));
            String actualStr = reader.readLine();
            // проверим
            assertEquals(expectedStr, actualStr);
        }

        @DisplayName("find all events")
        @Nested
        class findAllEventsTest{
            @Test
            public void returns_correct_list_of_events() throws IOException{
                // пишем в файл 2 события
                BufferedWriter writer = new BufferedWriter(new FileWriter(TEMP_EVENTS_FILE_NAME));
                writer.write("1,New Year,2024-01-01");
                writer.newLine();
                writer.write("2,Holiday,2024-01-05");
                writer.newLine();
                writer.close();
                // ожидаемый список
                List<Event> expected = Arrays.asList(
                        new Event(1L, "New Year", LocalDate.of(2024,01,1)),
                        new Event(2L, "Holiday", LocalDate.of(2024,01,5))
                );
                // актуальный получаем из файла
                List<Event> actual = eventRepository.findAll();
                //сравнить
                assertEquals(expected, actual);
            }
        }
    }


    // приватные методы для тестов
    private void deleteFileAfterTest(String fileName) {
        File file = new File(fileName);
        deleteIfExists(file);
    }

    private void createNewFileForTest(String fileName) throws IOException {
        File file = new File(fileName);

        deleteIfExists(file); // удалили, если уже есть такой

        boolean result = file.createNewFile(); // создаем новый файл
        if(!result) {
            throw new IllegalStateException("Problem with file. Can't create.");
        }
    }

    private void deleteIfExists(File file) {
        if(file.exists()){
            boolean result = file.delete();
            if(!result){
                throw new IllegalStateException("Problem with file. Can't delete.");
            }
        }
    }


}