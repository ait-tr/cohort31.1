public class Product {

    public static int temp;

    private static  int counter=0;
    private int id;
    private String title;
    private double price;


    public Product ( String title, double price){
        counter+=10;
        this.id=counter;
        this.title=title;
        this.price=price;
        Math.min(10,90);
    }

    public String toString(){
        return id+"."+ title + " "+price +" static temp:"+temp;
    }

    public double getPrice(){
        return price;
    }
    public int getId(){
        return id;
    }

    public static void print(){
        System.out.println("I'm product");
    }

}
