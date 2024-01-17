package homework.greeting_example.model;

public class Greeting {
    // определяем методы, которые будут получать на вход аргумент типа String и печатать эту строку
    public void g1(String str) {
        System.out.println("g1: " + str);
    }

    public void g2(String str) {
        System.out.println("g2: " + str);
    }

    public void g3(String str) {
        System.out.println("g3: " + str);
    }

    public void g4(String str) {
        System.out.println("g4: " + str);
    }

    public void gPrivate(String str) {
        System.out.println("g private: " + str);
    }
}
