public class Main {

    //  Цикл For
    /*
    for(initialisation; condition; increment/decrement ){

      statement(s)
    }
    initialisation - присвоение начального значения переменной(счетчика), которая будет изменяться в цикле
    condition - булеановское выражение, определяющее будет ли выполняться цикл
    increment/decrement - изменение счетчика
     */
    public static void main(String[] args) {


        for (int i = 0; i<=10; i++)
        {
      //      System.out.println(i);
        }

        char exit = 'N';
        while(exit !='N'){
            System.out.println("hello");
        }

        for( int i = 100;i > -100; i-=5){
            System.out.println(i);
        }
        System.out.println("End of for loop");

       // int i=0,j=10;
        for(int  i = 0, j = 10 ; i < j ; i++,j--){
            System.out.println("i and j:"+i+" "+j);
        }
        int i = 0;

        for(  ; i < 10; )
        {
            System.out.println(i);
            i++;

        }

   //     for( ; ; ){  // бесконечный цикл
   //     }


        // посчитать сумму чисел от 0 до n  используя for цикл
        int n = 10;
        int sum = 0;

        for ( int j = 0;j <= n;j++){
            sum += j;
        }
        System.out.println(sum);


        // без тела цикла
       //  int y;
         sum = 0;
         for(int y =0;y<=n; sum +=y++ );

        System.out.println("sum with no body is "+sum);









    }


}
