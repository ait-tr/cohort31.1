package practicum;

public class EvenOrOddNumber {
    public static void main(String[] args) {
//        Имеется целое число n, задайте его самостоятельно в программе.
//        Выясните, является ли это число четным?
//        Является ли это число кратным 3? Кратным 5? Кратным 10?

        int n = 3;

    // четное - это то число, которое делится на 2 без остатка (остаток = 0)
    // % - это деление с остатком

       if (n % 2 == 0) {
           System.out.println("The number is even");
       } else {
           System.out.println("The number is odd");
       }

        // кратное 3 - это то число, которое делится на 3 без остатка (остаток = 0)
        // % - это деление с остатком

        int k = 11;

        if (k % 3 == 0) {
            System.out.println("The number " + k + " is divided by 3");
        } else {
            System.out.println("The number " + k + " is not divided by 3");
        }

        // кратное 5 - это то число, которое делится на 5 без остатка (остаток = 0)
        // % - это деление с остатком

        int l = 45;

        if (l % 5 == 0) {
            System.out.println("The number " + l + " is divided by 5");
        } else {
            System.out.println("The number " + l + " is not divided by 5");
        }

    }
}
