package practicum;

public class Triangle {
    public static void main(String[] args) {
//        Даны 3 целых числа 10, 3 и 2 - длины отрезков.
//        Проверьте, можно ли из них составить треугольник или нельзя?

        // неравенство треугольника - длина любой cтороны треугольника меньше суммы двух других
        int a = 10;
        int b = 3;
        int с = 2;

        if ( a < (b + с) && b < (a + с) && с < (a + b) ) { // && - ...
            System.out.println(" Yes, triangle exists!");
        } else {
            System.out.println(" No, triangle does not exist!");
        }

    }
}
