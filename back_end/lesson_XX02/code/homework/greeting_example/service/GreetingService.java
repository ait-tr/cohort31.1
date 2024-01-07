package homework.greeting_example.service;

import homework.greeting_example.model.Greeting;

public class GreetingService {
    // поле для хранения объекта - приветствие
    private Greeting greeting;

    // стандартный конструктор, создает объект типа greetingService
    public GreetingService(Greeting greeting) {
        this.greeting = greeting;
    }

    // методы, получают на вход два аргумента
    // им передаем строки и печатаем
    public void caller(String funcName, String arg){
        switch (funcName) {
            case "f1":
                greeting.g1(arg);
                break;
            case "f2":
                greeting.g2(arg);
                break;
            case "f3":
                greeting.g3(arg);
                break;
            case "f4":
                greeting.g4(arg);
                break;
            default:
                System.out.println(funcName + " doesn't exists");
        }
    }
}
