package lesson22.homework22.eShop;
// HAS A
public class Clothes  {
    private Product product;

    public Clothes(Product product) {
        this.product = product;
    }

    public void buy(){
        product.buy();
    }
    public void buy(int a){
        product.buy();
    }

    public String toString(){
        return product.toString();
    }

}
/*
UML -
 */