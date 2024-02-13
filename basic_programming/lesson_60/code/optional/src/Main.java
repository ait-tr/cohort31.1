import java.util.List;
import java.util.Optional;

public class Main {
  public static void main(String[] args) {
    List<String> fruits = List.of(
        "orange", "apple", "banana",
        "mango", "kiwi",
        "fig"
    );
//    как получить первый элемент удовлетворяющий описанию?
//    findFirst
    Optional<String> kiwiOptional = fruits.stream()
        .filter(s -> s.length() < 5)
        .findFirst();
    String fruit = kiwiOptional.get();
    System.out.println(fruit);
    Optional<String> shortestOptional = fruits.stream()
        .filter(s -> s.length() < 4)
        .findFirst();
//    shortestOptional.get(); // Exception in thread "main" java.util.NoSuchElementException
    System.out.println(shortestOptional.isPresent());
//    if(shortestOptional.isPresent()){
//      System.out.println(shortestOptional.get());
//    }
//    shortestOptional.ifPresent(s->{
//      System.out.println(s);
//    });
    shortestOptional.ifPresent(System.out::println);
//    Добавить значение по умолчанию -
//    будет подставляться в случае, если внутри Optional пусто
//    Если есть значение - мы его получим
//    Если нет - используем - то, которое указали в supplier
    String result =
        shortestOptional.orElseGet(()->"passion fruit");
    System.out.println(result);
//  Если есть значение - мы его получим.
//  Если нет - выбросим ошибку.
    String res2 = shortestOptional
//        Указываете подходящий класс исключения. Может бысть кастомный
        .orElseThrow(IllegalArgumentException::new);
    System.out.println(res2);
//  Создайте лист из продуктов - 3-5 продуктов.
//    Пусть в продукте будут поля название и цена
//  Создайте метод getProductByTitle -
//    пусть метод принимает название продукта и список продуктов
//    и возвращает продукт с указанным названием (первый попавшийся)
//    а если этого продукта нет
//    - продукт с названием "doll" и ценой 15
  }
  public static Product getProductByTitle(
      String title, List<Product>products
  ){
    Optional<Product> optional = products
        .stream()
        .filter(p->p.getTitle()
            .equalsIgnoreCase(title))
        .findFirst();
    return optional
        .orElseGet(()->new Product("doll", 15));
  }
}