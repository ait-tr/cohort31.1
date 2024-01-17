
public class Main {
    public static void main(String[] args) {
        int a=1;
        int b=10;

        //-------
        try{
            System.out.println(div(a,b));
        } catch (Exception e){
            System.out.println("Error");
            System.out.println("The program is terminated");
        }
    }

    public static int div(int a, int b){
        if (b==0) {
            throw  new RuntimeException();
        }
        int res=a/b;
        return res;
    }

}