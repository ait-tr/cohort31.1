public class Singleton {
    public final static String MESSAGE = "this is singleton pattern";
    private static Singleton INSTANCE=null;

    public int temp;

   private Singleton(){
       System.out.println("we are in constructor");

    }

    public static Singleton getInstance(){
       if (INSTANCE==null){
           INSTANCE = new Singleton();
       }
       return INSTANCE;
    }

    public void print(){
        System.out.println(MESSAGE);
        System.out.println(temp);
    }


}
