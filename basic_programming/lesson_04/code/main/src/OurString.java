public class OurString {

    // String class
    /*
     Hello

     */
    String john = "John";
  //  String bill = new String();


    public static void main(String[] args) {

        String hello = "Hello";
        String java =  "Java";
        // 0 1 2 3 4
        // H e l l o    length = 5

        // length() - находит длину строки
       int len = hello.length();
        System.out.println("length of hello is "+len);

        int lenJava = java.length();
        System.out.println("length of java is "+lenJava);

        // charAt() - находит символ на заданной позиции ( по заданному индексу)
       char ch0 = hello.charAt(0); // H
        System.out.print(hello.charAt(0)+" ");
       char ch1 = hello.charAt(1); //e
        System.out.print(ch1+" ");
       char ch2 = hello.charAt(2); // l
        System.out.print(ch2+" ");
       char ch3 = hello.charAt(3); // l
        System.out.print(ch3+" ");
       char ch4 = hello.charAt(4); // o
        System.out.print(ch4);
        System.out.println();
        System.out.println();

        // перевод букв в верхний регистр
        String helloCapital = hello.toUpperCase();
        System.out.println(helloCapital);

        //  перевод букв в нижний регистр
        String helloSmall = helloCapital.toLowerCase();
        System.out.println(helloSmall);





    }
}
