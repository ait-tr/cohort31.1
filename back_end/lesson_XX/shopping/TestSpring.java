package shopping;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import storage.Base;

public class TestSpring {
    public static void main(String[] args) {
        // считали контекст приложения, получили объект context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        // из него получили объект методом .getBean
        Wallet wallet = context.getBean("wallet", Wallet.class); // аргументы - имя объекта и имя класса
        // внедряем зависимость
        wallet.makePurchase();
        context.close(); // закрыли контекст приложения

    }
}
