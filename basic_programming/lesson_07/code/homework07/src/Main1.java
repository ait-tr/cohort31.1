public class Main1 {

    public static void main(String[] args) {

        /*
        Задача 1.
Написать программу, выводящую на экран максимальное из трех целых чисел.
Числа задайте самостоятельно внутри программы.
Решите эту задачу с помощью if ... else и также с помощью тернарного оператора.
*/

        int n1 = 0;
        int n2 = 4;
        int n3 = 5;

        System.out.println("With else if");

        if ( n1 > n2 && n1 > n3){
            System.out.println("max is "+n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("max is "+n2);
        } else {
            System.out.println("max is "+n3);
        }

        System.out.println("Without else");

        if ( n1 > n2 && n1 > n3){
            System.out.println("max is "+n1);
        }
        if (n2 > n1 && n2 > n3) {
            System.out.println("max is " + n2);
        }

        if (n3 > n1 && n3 > n2) {
            System.out.println("max is " + n3);
        }

        System.out.println("With ternary operator");

        int a = 1;
        int b = 2;
        int c = 3;

        int max = (a > b) ?(a > c ? a : c): (b > c ? b : c);
        System.out.println(" max of a,b,c is "+max);





/*
Задача 2.
В программе задаются случайным образом две целочисленные координаты x и y в интервале
от -10 до 10. Определите, в какую четверть попадает точка с координатами ( x, y).
*/

        System.out.println("*********************Task 2 - Quaters**************************");
int x = 9;
int y = -1;

if( x > 0 && y > 0){
    System.out.println(" First quarter");
}

else if ( x < 0 && y > 0){
    System.out.println("Second quarter");
}

else if ( x < 0 && y < 0){
    System.out.println("Third quarter");
}

else if ( x > 0 && y < 0){
    System.out.println("Fourth quarter");
}
else {
    System.out.println("Zero");
}

        /*
Задача 3. По данному числу n закончите фразу "На лугу пасется..." одним из возможных продолжений:
"n коров", "n корова", "n коровы", правильно склоняя слово "корова".
Входные данные: Дано целое положительное число n (n <= 10),
Выходные данные: Программа должна вывести введенное число n и одно из слов: коров, корова или коровы,
например, 1 корова, 2 коровы, 5 коров.
*/
        int n = -3;

        System.out.print(n +" ");
        // 2 <= n <= 4
        if ( n >= 2 && n <= 4){
            System.out.println("коровы");
        }

        else if (n >= 5 && n <= 10 || n == 0 ){
            System.out.println("коров");
        }

        else if (n == 1){
            System.out.println("корова");
        }
        else {
            System.out.println("You entered wrong number of cows");
        }


        /*
Задача 4(*). Написать программу, определяющую является ли год високосным (значение года задается в программе).
Для того чтобы быть високосным, год должен: делится без остатка на 4 и либо не должен
делится без остатка на 100, либо, если он делится на 100, то он должен делится также на 400.
         */
        System.out.println("***************LEAP YEAR**************************");
        int year = 1900;

       boolean a1 = (year % 4) == 0;
       boolean b1 = (year % 100) != 0;
       boolean c1 = ((year % 100 == 0)&& (year % 400 == 0));
       boolean result = a1 && (b1 || c1);
        System.out.println("is "+year + " a leap year ? "+result);




    }
}
