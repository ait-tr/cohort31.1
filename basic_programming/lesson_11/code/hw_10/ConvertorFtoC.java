package hw_10;
import java.util.Scanner;

public class ConvertorFtoC {
    public static void main(String[] args) {
        // конвертор (методом ) F в С, С =  5*(F-32)/9
        // вызов метода

        convertorFtoC();

    }
    // ___________methods _____________
    public static void convertorFtoC() {
        // тело метода
        System.out.println("Input temperature in F (positive, integer): ");
        Scanner scanner = new Scanner(System.in);
        int tempF = scanner.nextInt();
        double tempC = 5.0 * ( (double) tempF - 32) / 9.0;
        System.out.println("Temperature in С = " + tempC);

        System.out.printf("Temperature in С = %.2f" , tempC);

    }

    // __________end of methods ________
}
