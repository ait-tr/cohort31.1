package practicum;

public class NegativeOrPositive {
    public static void main(String[] args) {
//        Имеются два целых числа n и m, задайте их самостоятельно в программе.
//        Выясните, является ли хотя бы одно из них отрицательным?
    int n = 8;
    int m = -8;

    if ( n < 0 | m < 0 ) { // проверить, как работает | или ||
        System.out.println("One of numbers is negative ");
    } else {
        System.out.println("Both numbers are positive");
    }

    }
}
