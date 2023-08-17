package lesson22.homework22.eShop;

public class Electronics  {

    private Product product;
    public Electronics(Product product) {

        this.product = product;
    }


    public void buy() {
        product.buy();
        makeWarranty();
    }

    private void makeWarranty() {
        System.out.println("The product includes the official warranty. Please, fill the form.");
    }

    public  String toString(){
        return product.toString();
    }
}
