import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
//    ## Подготовка к заданию
//    Создайте класс товар Product с полями:
//    - название
//        - рейтинг
//        - цена
//        - категория
//    Создайте лист из 10 товаров с разными значениями
//
//## Задание 1
//    Получите лист товаров, которые стоят дороже 200 евро.
    List<Product> products = List.of(
        new Product("Chair Aemes", 9, 200, "furniture"),
        new Product("Iphone XR", 7, 1000, "electronics"),
        new Product("Gibson Les Paul", 6, 2000, "music"),
        new Product("Iron", 9, 120, "electronics"),
        new Product("Washing machine", 2, 800, "electronics"),
        new Product("Vinyl Beatles", 5, 40, "music"),
        new Product("Jeans", 4, 70, "clothes")
    );
    // 1.   Получите лист товаров, которые стоят дороже 200 евро.
    List<Product> expensiveProducts = products.stream()
        .filter(product -> product.getPrice() > 200)
        .toList();
    System.out.println(expensiveProducts);
//    Сколько товаров стоят дороже 200
//    Метод count
    long res = products.stream()
        .filter(product -> product.getPrice() > 200)
        .count();
    System.out.println(res);
//    2. Получите лист товаров, отсортированных по рейтингу
    List<Product> sortedByRating = products.stream()
        .sorted((a, b) -> Double.compare(b.getRating(), a.getRating()))
        .toList();
    System.out.println(sortedByRating);
    List<Product> topFive = products.stream()
        .sorted((a, b) -> Double.compare(b.getRating(), a.getRating()))
        .limit(5)
        .toList();
    System.out.println(topFive);
//    3. Проверьте есть ли в листе товаров, товар с названием: "Iphone XR"
    boolean hasIphone = products.stream()
        .anyMatch(p -> p.getTitle().equals("Iphone XR"));
    System.out.println(hasIphone);
//    4. Создайте новый лист товаров на основании старого,
//    пусть в новом листе рейтинг будет увеличен на 1
//    Товары в исходном листе **не должны** измениться.
//    Плохой вариант
    List<Product> newProducts = products
        .stream()
        // вариант с мапом - но для сайд эффектов можно использовать peek
//        .map(p -> {
//          p.setRating(p.getRating() + 1);
//          return p;
//        })
        .peek(p -> p.setRating(p.getRating() + 1)) // как forEach, но не терминальный
        .toList();
    System.out.println(products);
//    Теперь выполним 4-е задание как оно задумано
    List<Product> brandNewProducts = products.stream()
        .map(p -> new Product(
            p.getTitle(),
            p.getRating() + 1,
            p.getPrice(),
            p.getCategory()
        )).toList();
    System.out.println(brandNewProducts);
//
    List<Product> products1 = new ArrayList<>(brandNewProducts);
    products1.get(0).setRating(200);
//  5.  Измените цену товаров в исходном листе товаров: увеличьте ее на 20 евро.
//        Товары в исходном листе **должны** измениться.
//    Вариант без референса и отдельного метода
    products.forEach(s -> s.setPrice(s.getPrice() + 20));
//    Вариант с метод референсом - добавили в класс Product метод getMoreExpensive
//    products.forEach(Product::getMoreExpensive);
    System.out.println(products);
//    6. Посчитайте общую стоимость всех товаров в листе.
    double totalPrice = products.stream()
        .map(Product::getPrice)
        .reduce(0.0, Double::sum);
    System.out.println(totalPrice);
  }
}