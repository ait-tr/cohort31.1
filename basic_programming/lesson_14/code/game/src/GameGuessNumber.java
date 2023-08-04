import java.util.Scanner;

public class GameGuessNumber {

    /*
    Написать игру "Угадай число", в которой за ограниченное число попыток ввода числа
    с клавиатуры нужно угадать секретное число от 0 до 9.

    Условия;
    1.Код игры находится в классе GameGuessNumber
    2.Класс должен содержать:
        - сканер для ввода числа
        - secret ,  в которой записано секретное число
        - следующие методы:
            - метод, считывающий количество предоставляемых попыток
            - метод, который считывает вводимое число
            - метод, содержащий логику игры
            - метод - последовательности вызова прдыдущих методов
     */

    static Scanner scanner = new Scanner(System.in);
    static int secret = 9;

    public static void main(String[] args) {
        start();
    }


    public static void start() {
        int attempts = readNumberOfAttempts();
        guessNumber(attempts);
        scanner.close();
    }


    //  считывает с клавиатуры количество попыток
    static int readNumberOfAttempts() {
        System.out.println("Enter number of attempts ");
        return scanner.nextInt();
    }

    //  считывает с клавиатуры число
    static int readNumber() {
        System.out.println("Enter the number from 0 to 9");
        return scanner.nextInt();
    }

    static void guessNumber(int attempts) {
        while (attempts > 0) {
            int number = readNumber();
            attempts--;
            if (number == secret) {
                System.out.println("Bingo! You have guessed the secret number!!! ");
                return;
            } else {
                System.out.println("Wrong! You have " + attempts + " attempts left.");
            }

        }
        System.out.println("Sorry,buddy. Maybe some other time");

    }

}
