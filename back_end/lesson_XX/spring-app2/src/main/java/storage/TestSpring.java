package storage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        // считали контекст приложения, получили объект context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        // из него получили объект типа TestBean методом .getBean
        Store storage = context.getBean("storeBean", Store.class); // аргументы - имя объекта и имя класса
        // внедряем зависимость
        Base base = new Base(storage);
        base.keep();
        context.close(); // закрыли контекст приложения

    }
}
