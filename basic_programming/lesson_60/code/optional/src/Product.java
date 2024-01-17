public class Product {
  String title;
  double price;

  public String getTitle() {
    return title;
  }

  public double getPrice() {
    return price;
  }

  public Product(String title, double price) {
    this.title = title;
    this.price = price;
  }

  @Override
  public String toString() {
    return "Product{" +
        "title='" + title + '\'' +
        ", price=" + price +
        '}';
  }
}
