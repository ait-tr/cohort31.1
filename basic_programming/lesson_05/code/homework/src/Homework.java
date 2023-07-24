public class Homework {

    public static void main(String[] args) {

        /*
        Задача 1
        Написать программу, вычисляющую и выводящую на печать ASCII значение символа 'B'.
         */

        char ch = 'A';
        System.out.println(ch);

        int chInt = 'A';
        System.out.println(chInt);

        chInt = 'B';
        System.out.println(chInt);

        chInt++;
        System.out.println(chInt);

        int hex = 0xFF; // 16ричное чило
        System.out.println(hex);

        int oct = 011; // 8ричное
        System.out.println(oct);

        int binary = 0b1100;// двоичное
        System.out.println(binary);

        /*
 Задача 2
Даны две строки а и в. Написать программу, соединяющую их и выводящую на экран в виде abba,
Например "Hi" и "Bye" должны быть напечатаны как HiByeByeHi
         */

        String a = "Hi";
        String b = "Bye";

        String result = a + b + b +a;

        System.out.println(result);



        /*
Задача 3
Написать прогрмму, выводящую на экран символ строки с индексом 2.
Например, если строка Java, то результат будет 'v'
         */

        String javaString = "Java";

      char chJava =  javaString.charAt(2);// сначала будет найден символ на позиции 2 в слове Java, затем найденное
                                            // значение будет присвоено перменной chJava

        System.out.println("Symbol at 2 poistion in Java is  "+ chJava);

        chJava = javaString.charAt(0);
        System.out.println("Symbol at 0 poistion in Java is  "+ chJava);

      //  chJava = javaString.charAt(4);
        chJava = javaString.charAt(3);
        System.out.println("Symbol at the  last poistion in Java is  "+ chJava);

        javaString = "Hi";
        int lengthHi = javaString.length();
        System.out.println("Hi length is "+lengthHi);
        chJava = javaString.charAt(lengthHi - 1); // получение символа на последней позиции в слове
        System.out.println("Symbol at the  last position in "+javaString+" is  "+ chJava);

        javaString = "Bye";
        int lengthBye = javaString.length();
        System.out.println(javaString+" length is "+lengthBye);
        chJava = javaString.charAt(lengthBye - 1); // получение символа на последней позиции в слове
        System.out.println("Symbol at the  last position in "+javaString+" is  "+ chJava);


        /*
 Задача 4
Написать программу, выводящую на экран целое число, равное двойной длине строки.
Т.е. если есть строка Java, то ответ будет 8
         */

        String helloStr = "hello";

        int helloLength = helloStr.length();

        System.out.println("Double string length = "+2*helloLength);

        // substring() method.
        // 1.Находит часть строки начиная с  символа на указанной позиции
        //              0 1 2 3 4
        //              w o r l d
        String world = "world";
      String subWorld =  world.substring(1); // начиная с символа по индексу 1
        System.out.println(subWorld);

        // находит часть строки начиная с символа на указанной позиции (beginIndex) и заканчивая( но не включая) символом на
        //   позиции окончания нужного отрезка ( endIndex)
        subWorld = world.substring(1,4);
        System.out.println(subWorld);

        subWorld = world.substring(1,world.length()-1);
        System.out.println(subWorld);

        subWorld = world.substring(0);
        System.out.println(subWorld);

        //  в методе substring()  символ на позиции  индекса начала подстроки включается в подстроку, а конца полстроки
        //  не включается.

       // subWorld= world.substring(1,0);
        // индекс  не может быть меньше нуля и индекс конца подстроки не может быть меньше индекса начала.
        System.out.println(subWorld);





    }
}
