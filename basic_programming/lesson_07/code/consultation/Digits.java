package consultation;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        // дано целое число
        // определить сколько в нем цифр

     Scanner scanner = new Scanner(System.in); // будем читать данные с клавиатуры
        System.out.println("Input number: ");
        int num = scanner.nextInt(); // получаем целое число с клавиатуры от пользователя

        int count = 0;

        // узнаем сколько в нем цифр
        while ( num > 0 ) {
            num = num / 10;
            System.out.println(num);
            count++;
            System.out.println(count);

        }

        System.out.println("Number of digits is: " + count);

    }
}
