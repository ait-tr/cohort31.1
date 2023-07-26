package hw_7;

public class MultiplyN {
    public static void main(String[] args) {
//        результат умножения данного числа n на все целые числа от 0 до n

        int n = 3;
        int i = 0;

        while (i <= n) {
            System.out.println( i * n);
            i++;
        }
    }
}
