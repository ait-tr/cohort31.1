public class Fruit {
  String title;
  double weight;

  public Fruit(String title, double weight) {
    this.title = title;
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "Fruit{" +
        "title='" + title + '\'' +
        ", weight=" + weight +
        '}';
  }
}
