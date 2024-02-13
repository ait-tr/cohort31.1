package lesson22.homework22.eShop;

// extends Object
public class Product {

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

   private String title;
    private double price;



    public Product(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public void buy() {
        System.out.println("buy:process start..");
        System.out.println("    Your order contain: " + title);
        System.out.println("    The standart delivery time is 72 hours.");

    }


}
