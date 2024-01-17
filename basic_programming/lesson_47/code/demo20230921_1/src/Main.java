import java.util.Deque;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /*
        try{

        } catch () {

        } finally {

        }

        */

        //throw
        //throws
        int value =0;


        try {
            value = readInt();
        } catch ( InputMismatchException | NullPointerException e){
            System.out.println("not correct");
            if (e instanceof NullPointerException) {
                System.out.println("Null Pointer");
            }
        } catch (Exception e){
            e.printStackTrace();
            System.out.println(" EXCEPTION!!! ");
        }




        System.out.println(value);
        try {
            System.out.println("div   "+div(18,0));
        } catch (MyCheckedException e){

        }

        div2(7,0);

    }


    public static int div(int a, int b) throws MyCheckedException {

        if (b == 0) throw new MyCheckedException("Not correct value");

        return a/b;
    }

    public static int div2(int a, int b)  {
        if (b==0) throw new MyUnCheckedException("Not correct value");
        return a/b;
    }

    public static int readInt(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input int: ");
        //int value;
        try {
            int value = scanner.nextInt();
            System.out.println("The input value: " +value);
            return value;
        } catch (Exception e){
            throw new ReadIntException();
        } finally {
            System.out.println(" _____ finally ______");
        }



    }



    /*
    public static int readInt(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input int: ");
        int value = scanner.nextInt();
        value= 10/value;
        System.out.println("The input value: " +value);
        return value;

    }

     */
}