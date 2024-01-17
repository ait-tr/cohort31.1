public class Product {
  private String title;
  private double rating;
  private double price;
  private String category;

  @Override
  public String toString() {
    return "Product{" +
        "title='" + title + '\'' +
        ", rating=" + rating +
        ", price=" + price +
        ", category='" + category + '\'' +
        '}';
  }
  public void getMoreExpensive(){
    price +=20;
  }

  public Product(String title, double rating, double price, String category) {
    this.title = title;
    this.rating = rating;
    this.price = price;
    this.category = category;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public double getRating() {
    return rating;
  }

  public void setRating(double rating) {
    this.rating = rating;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }
}
