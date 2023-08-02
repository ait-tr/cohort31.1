public class Main {
    public static void main(String[] args) {
   //  int result = sumNumbers(2,8);
   //     System.out.println(result+1);
        System.out.println(sumNumbers(1,3)+1);

        System.out.println("---------Task2----------------");

        int[]nums ={1,2,3,4,5};
        System.out.println(sumOfArray(nums));

        String res = helloName("John");
        System.out.println(res);

        System.out.println(helloName("Ann"));

        System.out.println(checkNumbers(1));

      //  "Hello".substring(1,4);

        System.out.println("with two args: "+ sumNumbers(1,2));
        System.out.println(("with three args: "+sumNumbers(1,2,3)));
        System.out.println(("with three args: "+sumNumbers(1.5,2.5)));

    }

    static int sumNumbers(int a, int b){ // 1, 2
      //  int sum = a + b;//3
       // System.out.println( );
      //  return sum; //3
        return a+b; //3
    }

    static int sumNumbers(int a, int b, int c){

     //   return a + b + c;
        return a +b + c;
    }

   static double sumNumbers( double a, double b){

       return a + b;
    }

 //   static double sumNumbers (int a, int b){
 //       return a +b;
 //   }


    static int sumOfArray( int[]ints ){
        int sum = 0; // начальное значение переменной sum

        for( int i = 0; i<ints.length; i++){
            sum += ints[i];
        }
     //   System.out.println("sum of elements in array  = "+sum);

        return sum;
    }

    // Написать метод, принимающий имя и возвращающий строку типа Hello, name!

    static String helloName( String name){
       // String res = "Hello, "+ name + "!";

      //  return res;
        return "Hello, "+ name + "!";
    }

    // написать метод, который принимает число и проверяет является ли число двузначным или трехзначным .
    // метод возвращает строку, в которой отвечает на этот вопрос

    static String checkNumbers( int num){
        if(num>=10 && num<100)
            return num +" is two-digit number";
        else if(num>=100 && num <1000)
            return num+" is three-digit number";

            return "This is not two or three digit number";

    }
}
