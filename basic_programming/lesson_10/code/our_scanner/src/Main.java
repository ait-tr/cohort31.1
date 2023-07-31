//  импортировать класс Scanner если импорт не происходит автоматически
import java.util.Scanner;
//import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println();

        //создаем сканер
        Scanner scanner = new Scanner(System.in);


   //     System.out.println("Enter a number ");
        // чтение ввода пользователя и запись результата в переменную num1
   //    int num1 = scanner.nextInt();

    //    System.out.println("You entered number "+num1);

   //     System.out.println("Enter second number ");
   //     int num2 = scanner.nextInt();// используется для чтения целых чисел

   //     System.out.println("You entered number "+num2);

   //     int sum = num1 + num2;

   //     System.out.println(num1+ " + "+ num2+" = "+sum);

        //  метод для чтения строк nextLine() -  считывает пользовательский ввод в виде строки

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        String bin = scanner.nextLine();
     //   System.out.println(bin);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your surname:");
        String surname = scanner.nextLine();

     //   System.out.println("Enter your age: ");
     //   int age = scanner.nextInt();

        System.out.println("Hello, "+name+" "+surname+" ! "+"You are "+age+" old.");


        //next()- считывает пользовательский ввод в виде строки до пробела

        System.out.println("Enter your name and surname ");
        String nameSecondName = scanner.next();
        System.out.println(nameSecondName);

        scanner.close();
    }
}
