import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter speed");
        double speedMiles = sc.nextDouble();

        convertSpeed(speedMiles);
       // convertSpeed(1000);

        System.out.println("---------Task2----------------");

        int[]nums ={1,2,3,4,5};
        sumOfArray(nums);

        System.out.println("\n---------------Task3------------------------");
        reverseArray(nums);

        System.out.println("-----------------Task4---------------------------");

        Random random = new Random();
        double[] randomMoney = new double[20];

        for( int i = 0; i < randomMoney.length; i++){
            randomMoney[i] = random.nextDouble(10000,100000000);
          //  randomMoney[i] = random.nextDouble()*(100_000_000 - 10000)+10000;
            System.out.printf("%.2f \n",randomMoney[i]);
        }
      double[] resultDenominated = countNewAmount(randomMoney);
    }

    /*
    Задача1
Реализуйте с помощью метода конвертор, который переводит скорость в милях
в час в скорость в км/час. 1 миля равна 1609 метров.
Метод получает на вход данные от пользователя с клавиатуры.
     */

        static void convertSpeed( double speedMiles){
        double speedKm = 1.609 * speedMiles;
        System.out.println("Speed in miles/hour is  "+speedMiles +" and speed in km/hour is "+speedKm);
    }


    /*
    Задача2
Реализуйте метод sumOfArray (сумма элементов массива),
который получает на вход массив и определяет сумму его элементов.
     */

    static void sumOfArray( int[]ints ){
        int sum = 0; // еачальное значение переменной sum

        for( int i = 0; i<ints.length; i++){
            sum += ints[i];
        }
        System.out.println("sum of elements in array  = "+sum);
    }

    /*
    Задача3
Написать метод, принимающий массив целых чисел, и печатающий его в обратном порядке.
Сначала последний элемент, потом предпоследний, и т. д.
     */
        //1 2 3 4 5
    static void reverseArray( int[]ints){
        for( int i = ints.length - 1; i >=0; i--){
            System.out.print(ints[i]+" ");
        }
    }

    /*
    Задача 4 (*)
Имеется массив данных - остатки на счетах клиентов банка (задать случайными числами в интервале
от 10 000 до 100 000 000 д.е., количество клиентских счетов = 20). Произошла деноминация,
теперь 1 д.е = 100 старых д.е.
Рассчитайте новые остатки денег на счетах клиентов.
     */

    static double[] countNewAmount(double[] money){
        double[] denominated = new double[20];
        System.out.println("Denominated array");
        for( int i = 0; i < money.length; i++){
            denominated[i] = money[i]/100.0;
            System.out.printf("%.2f %n",denominated[i]);

        }
        return denominated;
    }
}
