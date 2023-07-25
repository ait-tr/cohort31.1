package homework;

public class Conditions {
    public static void main(String[] args) {
//        Есть две переменные  целого типа. Написать программу, выводящую на экран true, если значение одной из
//        переменных = 10 или сумма значений переменных равна 10. Иначе на экран выводится false.
//Пример:  int a = 10,  int b = 9   -> true
//        int a = 1 ,  int b = 9   -> true
//        int a = 4 ,  int b = 10  -> true
//        int a = 4 ,  int b = 3   -> false

        int a, b;
        a = 4;
        b = 3;

        boolean var_boolean = (a == 10) || (b == 10) || (a + b == 10);
        System.out.println(var_boolean);
    }
}
