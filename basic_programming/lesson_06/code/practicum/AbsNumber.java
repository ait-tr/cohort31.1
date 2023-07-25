package practicum;

public class AbsNumber {
    public static void main(String[] args) {
        //    Определите модуль целого числа с помощью тернарного оператора.
//    Целое число задайте случайным образом в интервале от -10 до 10.

        int a = -10;
        int b = 10;

        int n = (int)(Math.random() * (b - a + 1) + a);

        int absN = n > 0 ? n : -n; // тернарный оператор

        System.out.println("Absolute value of " + n + " is " + absN);

    }
}
