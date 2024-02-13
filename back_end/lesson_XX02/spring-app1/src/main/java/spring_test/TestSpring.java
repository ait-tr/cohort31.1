package spring_course;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_test.TestBean;

public class TestSpring {
    public static void main(String[] args) {
        // считали контекст приложения, получили объект context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        // из него получили объект типа TestBean методом .getBean
        TestBean testBean = context.getBean("testBean", TestBean.class); // аргументы - имя объекта и имя класса
        System.out.println(testBean.getName()); // из этого объекта вытащили значение поля методом getName
        context.close(); // закрыли контекст приложения
        
    }
}
