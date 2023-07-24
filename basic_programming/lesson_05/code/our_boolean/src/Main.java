public class Main {

    public static void main(String[] args) {
        // Тип boolean
    /*
     boolean  занимает 1 бит и может принимать два true  или false.
     Эти слова являются зарезервированными в джаве
     */
        boolean b;

        b = false;
       // int false =2;

        System.out.println("b is "+b);

        b = true;
        System.out.println("b is "+b);

      //  b = 45;

        //10>9

        // результатом выполнения операций сравнения в джаве будет true или false
        System.out.println("10 > 9 ? "+(10>9));
        System.out.println("10 > 9 ? "+(10<9));
     //   System.out.println("10 + 9 = "+(10+9));

     //   int a = 10;
     //   int c = 12;
     //   if(a < c)
     //       System.out.println("a < c");

        // Relational operators
        /*
        >  больше чем
        <   меньше чем
        >=  больше или равно
        <=    меньше или равно
        ==   равно
        !=  не равно

        Результатом выполнения операторов сравнения  будет true  или false.
        Сравнивать таким образом можно типы , где определен порядок сравнения ( 2>1). Сравнивать переменные типа
        boolean  не получится, так как не определено что больше - true  или false
         */
       // true > false - не определено
        int i = 11;
        int j = 10;
        System.out.println("comparing i and j");
        System.out.println("i = "+i + " and j = "+j);
        System.out.println("i< j "+(i < j));
        System.out.println("i> j "+(i > j));
        System.out.println("i<= j "+(i <= j));
        System.out.println("i>= j "+(i >= j));
        System.out.println("i== j "+(i == j));
        System.out.println("i != j "+(i != j));


        // Логические операторы ( Logical operators).
        // Результатом выполнения логических операторов также будет boolean

        /*
        &  - AND  И
        |  - OR   ИЛИ
        !  - NOT   НЕ
        ^  - XOR ( exclusive OR)  исключающее ИЛИ

        |||||||||||||
        p        q         p & q       p | q        p^q        !p

        False   False      False       False        False      True
        True    False      False       True         True       False
        False   True       False       True         True       True
        True    True       True        True         False      False
        Когда значения p  и q разные , XOR  дает true.  Когда одинаковые, то false
         */
        boolean b1 = true;
        boolean b2 = true;
        System.out.println("b1&b2"+(b1 & b2 ));
        System.out.println("!(b1&b2)"+!(b1 & b2 ));
        System.out.println("b1|b2"+(b1 | b2 ));
        System.out.println("b1^b2"+(b1 ^ b2 ));
        /*
 b1&b2false
!(b1&b2)true
b1|b2true
b1^b2true

          && -  Conditional-AND  and
          || -  Conditional-OR
     //  эти операторы будут проверять второй операнд только в случае необходимости, если результат не понятен.
     // Обычные OR and AND  будут всегда проверять оба операнда.

         */
        int n, d;

        n = 10;
        d = 0;

        if ( d != 0 && (n % d)==0 ) {
            System.out.println("n can be divided by d without remainder");
        }


    }

}
