public class Main {
    // XXII = X + X `+I+I = 22

  //  0--- 9

  //  513 = 5+1+3 = 9
  //  5*100 + 1*10 +3*1 = 513
  //  5*10^2 + 1*10^1 +3*10^0
   /*
   decimal      binary
   0            000
   1            001
   2            010
   3            011
   4            100
   5            101
   6            110
   7            111
   8           1000

   101 = 1*2^2 + 0*2^1 + 1*2^0 = 4 +0+ 1 = 5
   0000000000000000000000000000000

   000
   01
   10
   11

987654.321  = 0.987654321 * 10^6

ASCII - American Standard Code for Information Interchange

a...z - 26 символов
A....Z  - 26
0-9 - 10

& , знаки пунктуации - 32 симовла

Всего 95.

\n

0-9

16 система

Hexadecimal             Decimal             Binary
 0                          0                0000
 1                          1                0001
 2                          2                0010
 .
 .
 .
 A                           10
 B                           11
 C                           12
 D                           13
 E                           14
 F                           15

    */

    public static void main(String[] args) {

        System.out.println("\u0024");

    // Тип char.  В Джава для хранения симоволов используется 2 байта, т.е. можно хранить символы
    /*
        в диапозоне от 0 до 65535.
        Джава использует Юникод.   ASCII является частью юникода в диапазоне от 0 до 127

     */

        char ch = 'A';
        ch = 'X';
      //  ch = 'a';

        System.out.println("This is character: "+ch);
        System.out.println("This is character: "+'X');

        ch++;
        System.out.println("ch is now "+ch);

        int chInt = 'X';
        System.out.println("chInt is "+chInt);

        System.out.println("He says \"hello\"");
      //  \"  - для передачи двойных кавычек
      //  \'  - одинарная кавычка
      //  \\  -  слеш
      //  \n -  переход на новую строку
      //  \t    табуляция
      //  \u0000 - символ юникода

        System.out.print("Hello\n");
        System.out.print("\nJava\n\n");
        System.out.println("Hello\tJava\tHello");
        System.out.println();

        System.out.println("k");
        System.out.println('k');
      //  char ch2 = "k";

        String a = "Hello";

        Person john = new Person();
        john.name = "John";
        john.age = 25;


        System.out.println("Person name is "+john.name);
        System.out.println("Person's age is "+ john.age);
        john.canWalk();
        john.canTalk();


        Person bill = new Person();
        bill.name = "Bill";
        bill.age = 46;

        System.out.println("Person name is "+bill.name);
        System.out.println("Person's age is "+ bill.age);
        bill.canTalk();
        bill.canWalk();


    }



}
