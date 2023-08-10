/*
#1
        Создать класс Car со следующими полями (String brand, String color, String licensePlate, MyDate registrationDate, Engine engine}
        Оьратите внимание, поля registrationDate и engine - это тоже объект. Engine - содержмт информация о мощности двигателя и о типе (бензин, дизель, электро).
        - Реализуйте метод toString в каждом классе.
        - Реализуйте метод конструктор в каждом классе.
        - Создайте два объекта  автомобтля.

        #2
        В классе  Engine добавте методы start и stop. Кадлый из них пусть выводит строку "Engine is started" "Engine is stoped".
        В классе  Car добавте методы drive и stop. Первый должке заводить двигатель и писать, что такая то машина поехала.
        Второй, соответственно глушить двигатель и останавливать машину.

        #3 **
        Реализовать проверку, если машина уже едет, а я пытвюсь вызвать метод drive, должно появлятся сообщение, что машина уже едет.
*/


public class Main {
    public static void main(String[] args) {

        MyDate date1=new MyDate(10,4,2017);
        Engine engine1=new Engine(175,"benzine");
        Car car1 = new Car("Audi", "black","AAA7788", date1,engine1);
        Car car2 = new Car("BMW", "white","AAA7788",new MyDate(21,8,2022) ,new Engine(239,"dizel"));
        Car carWithProblem=new Car("WV", "gray","BBB5544",new MyDate(11,6,2021), engine1);  //!!!!



        Car[] cars = {car1, car2, carWithProblem};


        for (int i=0; i<cars.length; i++){
            System.out.println(cars[i].toString());
        }

        System.out.println("---------  GO ----------");
        for (int i=0; i<cars.length; i++){
           cars[i].drive();
        }

        System.out.println("------- test the second drive() call -------------");
        cars[0].drive();
        cars[0].stop();
        cars[0].drive();  // car1.drive()

        System.out.println("======================================================");
        cars[0].stop();
        cars[0].drive();
        cars[0].ignition();

        System.out.println("======================== 2 ===================");
        cars[0].stop();
        cars[0].ignition();
        System.out.println(cars[0].toString());


        System.out.println("---------  STOP ----------");
        for (int i=0; i<cars.length; i++){
            cars[i].stop();
        }



        //================================= Reference problem ===========================================================
        // one object engine for two cars !!!!!
        /*
        Engine engine1=new Engine(175,"benzine");
        Car car1 = new Car("Audi", "black","AAA7788", date1,engine1);
        Car carWithProblem=new Car("WV", "gray","BBB5544",new MyDate(11,6,2021), engine1);  //!!!!
         */

        System.out.println("================================= Reference problem ===========================================================");


        car1.stop();
        carWithProblem.stop();

        System.out.println(car1);
        System.out.println(carWithProblem);
        System.out.println();
        System.out.println("car1 should start engine");
        car1.ignition();
        System.out.println();

        System.out.println(car1);
        System.out.println(carWithProblem);

        System.out.println("=================== private demo ===========================");

        Car car4 = new Car("Opel", "blue","111111",new MyDate(10,10,2010),new Engine(150,"electro"));
        //car4.isDrive=true;  // the isDrive is private => error!!!

        System.out.println(car4);

        System.out.println();
        Person p1 = new Person("Jack",20);
        Person p2 = new Person("Ann",21);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println("The age of p1 is: "+p1.getAge());





    }
}