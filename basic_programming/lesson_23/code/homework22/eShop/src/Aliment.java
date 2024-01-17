package lesson22.homework22.eShop;

public class Aliment extends Product {

    private double urgPrice;
    public Aliment(String title, double price, double urgPrice) {
        super(title, price);
        this.urgPrice = urgPrice;
    }

    public void buy() {
        System.out.println("Your order contain: " + super.getTitle());
        System.out.println("The standart delivery time is 24 hours.");
        buyUrgent();
    }

    private void buyUrgent() {
        System.out.println("We can deliver your order within 1 hour for an additional " + urgPrice + " Eur.");
    }

}
