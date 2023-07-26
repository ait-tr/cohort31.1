public class Main {

    // цикл While

    public static void main(String[] args) {

      /*  System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);

       */

        // while( condition ){  condition  - это переменная или выражение, в результате дающее boolean
        //   statement;
        //   statement;
        //   }

        int i = 1; //  присвоение начального значения переменной условия цикла

        while (i <= 10){
            System.out.println(i++);
          //  i++;
        }

        System.out.println("End of while loop");


        int j = 10;

        while (j > 1){
            System.out.println(j);
            j--;
           // j++;
        }

   //     while(true){  // еще один пример бесконечного цикла
   //         System.out.println("hello");
   //     }

        // распечатать латинский алфавит из маленьких букв
        System.out.println("Print alphabet");
        char ch= 'a';

        while (ch <= 'z'){
            System.out.print(ch+" ");
            ch++;
        }
        System.out.println();

        // написать программу, считающую сумму чисел от 1 до 5.
        // 1+2+3+4+5
        int y = 1;
        int sum = 0;
        int n = 10;

        while (y <= n){
            sum = sum + y; // 1 +2+3+4+5 = 15
            y++;
        }
        System.out.println("sum of "+ n+" digits is "+sum);


        //  цикл DO-WHILE
        /*
        Отличие цикла do-while от while  заключается в том, что проверка условия в нем
        происходит в конце цикла

        do
        {
         statement(s)
        } while (condition )
         */
        System.out.println("Do-while example");
        int g = 0;

        do{

            System.out.println(g);
            g--;

        }while (g > 1);

        System.out.println("end of do-while");



        // Вложенные циклы.   Цикл может находиться внутри другого цикла.

        // Пример: Написать программу, выводящую на экран таблицу умножения
        System.out.println("Multiplication Table");
        int i1 = 1;
        while (i1 <= 9){ // i1 = 2

            int j1 = 1;
            while (j1 <= 9){ // j1 = 1
                System.out.println(i1+"*"+j1+" = "+ j1*i1);
                j1++;
            }
            System.out.println("***********************");
            i1++;
        }

    }
}
