/*
// SOLID
Используя класс SmartArray реализуйте следующую программу: пользователь с клавиатуры вводит целые числа. Как только пользователь вводит 0, программа выдает следующее:
You have input the following numbers: …введенные_значения…..
Total …колмчество_чисел… numbers
Average value: …среднее…

 */
public class Main {
    public static void main(String[] args) {

        NumbersReader numbersReader = new NumbersReader();
        SmartArray numbers = numbersReader.read();
        System.out.println(numbers);
        NumbersHandler handler = new NumbersHandler(numbers);
        handler.printStat();




    }
}