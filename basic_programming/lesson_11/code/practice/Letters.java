package practice;

import java.util.Scanner;

public class Letters {
    public static void main(String[] args) {
//        Реализуйте метод, который получает на вход строку на английском языке и сообщает количество
//        гласных букв в ней.

        // a, e, i, o, u, y - это гласные буквы
        // Шаг 1. Подключаем сканер
        // Шаг 2. Получить от пользователя строку
        // Шаг 3. Пишем метод, который принимает эту строку на вход
        // Шаг 4. Пройти циклом по всей строке charAt(index) и посчитать кол-во гласных

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string : ");
        String st = scanner.nextLine().toLowerCase(); // читает строку с клавиатуры до нажатия ввода, включая пробелы

        // st = st.toLowerCase(); - можно и так

        // вызов метода
        findLetters(st); // передаем ему на вход аргумент st

    }
    // _________Methods___________

    public static void findLetters(String s) {
        int count = 0; // объявили переменную, которая отвечает за счетчик гласных букв
        for (int i = 0; i < s.length(); i++) {
           if ( s.toLowerCase().charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'y') {
            // увеличивать счетчик
               count++;
           }
        }
        System.out.println("Number of vowels letters are: " + count);
    }

    //____________________________
}
