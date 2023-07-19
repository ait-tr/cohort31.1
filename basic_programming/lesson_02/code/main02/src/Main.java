public class Main {

    // Переменная1
    // Переменная2
    //....

    //Метод1
    //Метод2
    //....




 /*  JDK - Java Development Kit  - включает в себя JRE   и средства, позволяющие писать программы
  JRE - Java  Runtime Environment  - необходимо для запуска программ на джаве. Состоит из JVM и библиотек джавы
  JVM - Java Virtual Machine

  Принципы написания программ в Джава:
  - каждую команду принято писать с новой строки. В конце команды ставится точка с запятой.
  - программа не может просто состоять из команд. Команды находятся внутри функций ( методов), а функции внутри классов.
   */
    /*  комментарий для нескольких строк

     */

    // rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr  - комментарий для одной строки
    // rrrrrrrrrrrrrrrrr
    //ghhjkkk


    public static void main(String[] args) {

        System.out.println("Hello Java");
       // system.out.println("")
        System.out.print("Hello Java 1");
        System.out.println("Hello");


        // Переменные в Джава
        /*

         */
        int a = 4;
        String b;
        double c;
        char ch ='r';

        a = 10;
        System.out.println(a);
        System.out.println("a");

        a = a +1;
      //  b = 1;

        int x = 6;

        int sum = a + x;
        System.out.println(sum);

        System.out.println("Hello" +" Java");
        System.out.println(1-2+"1"+2);

        int  Sum1;
        int  sum1;

        int sum_numbers; // snake case
        int sumNumbers; // camel case

        // byte, short, int , long - для работы с целыми числами
        // float, double -  для работы с числами с запятой
        // char -  используется для хранения символов
        // boolean -может содержать два значения true  или false

        byte n = 12;
        short n1 = 30000;
        int n2 = 2147000000;
        long n3 =900000000000000L;

    }
}


