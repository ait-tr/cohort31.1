// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    int var1=10;

    public static void main(String[] args) {
        // var1=111; // error! can't get not static variable from static method
        // temp();  // error! can't get not static method from static method
        temp2(); //ok

        // work around
        Main main=new Main();
        main.temp();

    }

    public void temp(){
        System.out.println("hello");
    }

    public static void temp2(){
        System.out.println("hello");
    }

}