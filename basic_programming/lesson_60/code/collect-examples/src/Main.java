import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    List<String> fruits = List.of(
        "apple", "orange", "mango", "lime", "lime");
//    собираем в лист
    List<String> fruitsCapitals = fruits.stream()
        .map(String::toUpperCase)
        .collect(Collectors.toList()); // можете заменить на сокращенную
//  собираем во множество
    Set<String> fruitsSet = fruits.stream()
        .map(String::toUpperCase)
        .collect(Collectors.toSet());
    System.out.println(fruitsSet);
//  собрать в конкретную структуру
    LinkedList<String> fruitsLinkedList = fruits.stream()
        .map(String::toUpperCase)
        .collect(
            Collectors
                .toCollection(LinkedList::new));
// counting
    long count = fruits.stream()
        .collect(Collectors.counting()); // можете заменить на сокращенную
// собираем в Map
//    у нас массив слов fruits
//    сохраним сами слова как ключи,
//    а длину этих слов в качестве значений.
    Map<String, Integer> fruitsMap = fruits.stream()
        .map(String::toUpperCase)
//        s->s - это Function.identity()
        .distinct()
        .collect(Collectors.toMap(
            Function.identity(),
            fruit-> fruit.length()
        ));
    System.out.println(fruitsMap);


  }
}