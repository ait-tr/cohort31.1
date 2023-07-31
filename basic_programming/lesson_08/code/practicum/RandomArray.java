package practicum;

import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
//        Задайте массив из 10 случайных натуральных чисел в интервале от 1 до 100.
//        Запросите у пользователя какое-то натуральное число.
//        Определите, есть ли это число в массиве.

        int[] randomArray = new int[10]; // объявили массив

        // надо заполнить массив случайными числами
        int a = 1;
        int b = 100;
        int i = 0; // индекс

        while (i < randomArray.length) {
            int n = (int)((Math.random() * (b - a)) + a); // заполнение случайными числами
            System.out.print(randomArray[i] + " | ");
            i++;
        }

        Scanner scanner = new Scanner(System.in); // подключаем сканер для чтения клавиатуры
        System.out.println("Input number: ");
        int n = scanner.nextInt(); // это число от пользователя

        // ищем это число в массиве
        boolean flag = false;
        i = 0;
        while (i < randomArray.length){
            if (randomArray[i] == n) {
               // System.out.println("Bingo!");
                flag = true;
                break;
            }
            i++;
        }
        if (flag) {
            System.out.println("Bingo!!!");
        } else {
            System.out.println("Sorry...");
        }

    }
}
