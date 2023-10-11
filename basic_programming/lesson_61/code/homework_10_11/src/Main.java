import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    List<Alcohol> alcohols = List.of(
        new Alcohol("Radler", 2.5, 3.5),
        new Alcohol("Cognac", 40, 40),
        new Alcohol("Black label", 40, 15),
        new Alcohol("Red wine", 12.5, 10),
        new Alcohol("Martini bianco", 12, 12),
        new Alcohol("Vodka", 40, 30),
        new Alcohol("Vodka", 40, 30)
    );
//     1. Получите LinkedList из топ 3 самых дорогих товаров.
    LinkedList<Alcohol> topThree = alcohols.stream()
        .sorted((a, b) -> Double.compare(b.getPrice(), a.getPrice()))
//        .sorted() // естественный порядок сортировки Comparable<Alcohol>
        .distinct()
        .limit(3)
        .collect(Collectors.toCollection(LinkedList::new));
    System.out.println(topThree);
//    3. Получите самый дешевый товар
//    ver1
    Alcohol cheapest = alcohols.stream()
        .sorted()
        .findFirst()
//        .orElseThrow(NoSuchElementException::new);
        .orElseGet(() -> null);
//        .orElseGet(()->new Alcohol("Radler", 2.5, 3.5));
//        .orElse(new Alcohol("Radler", 2.5, 3.5));
    System.out.println(cheapest.getTitle());
//    if(cheapest != null){
//      cheapest.getTitle();
//    }
//    ver2
    Alcohol cheapest2 = alcohols.stream()
        .min((a, b) -> Double.compare(a.getPrice(), b.getPrice()))
        .orElseGet(() -> null);
// 4. Создайте Set из исходного листа.
    Set<Alcohol> alcoholSet = alcohols
        .stream()
//        здесь ваши промежуточные операции - если их нет
//        - то лучше заменить stream на констурктор HashSet
        .collect(Collectors.toSet());
// 5. Создайте Map из исходного листа, в котором ключами будут - названия товаров,
//    а значениями будут цены.
    Map<String, Double> pricesByNames = alcohols.stream()
        .distinct()
        .collect(Collectors
            .toMap(Alcohol::getTitle, Alcohol::getPrice));
//  6.
    Map<String, Double> strengthesByNames = alcohols.stream()
        .collect(Collectors
                .toMap(
                    Alcohol::getTitle,
                    Alcohol::getStrength,
                    (a, b) -> b)
        );
    System.out.println(strengthesByNames);


  }
}