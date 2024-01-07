package homework.greeting_example;

import homework.greeting_example.model.Greeting;
import homework.greeting_example.service.GreetingService;

public class GreetingAppl {
    public static void main(String[] args) {

        if(args.length !=2){
            System.out.println("Wrong numbers of arguments");
            return;
        }
        Greeting greeting = new Greeting(); // новый объект
        GreetingService greetingService = new GreetingService(greeting);

        greetingService.caller(args[0], args[1]);
    }
}
