package notes_reader;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        // считали контекст приложения, получили объект context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        // из него получили объект типа TestBean методом .getBean
        Notes notes = context.getBean("notesBean", Notes.class); // аргументы - имя объекта и имя класса
        // внедряем зависимость
        NotesReader reader = new NotesReader(notes);
        reader.readNotes();

        context.close(); // закрыли контекст приложения

    }
}
