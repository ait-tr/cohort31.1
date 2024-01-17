import java.util.List;
import java.util.Optional;

public class Main {
  public static void main(String[] args) {
//    forEach
//    method reference - ссылка на метод
    List<Panda> pandas = List.of(
        new Panda("Po", 60_000),
        new Panda("Boo", 65_000),
        new Panda("Small Jay", 40_000)
    );
//    Хочу изменить исходные значения - мутировать
//    Method ref: ClassName::methodName
    pandas.forEach(Panda::eatBamboo);
    System.out.println(pandas);
//  Операции - бывают:
//  - intermediate - промежуточные
//  - terminal - последняя в цепочке методов -
//  после нее мы уже не можем продолжать

//    reduce - сведение к какому-то
    double totalWeight = pandas
        .stream()
        .map(Panda::getWeight)
        // пока не заменили на метод референс было так:
        // (a, b) -> a + b
        .reduce(0.0, Double::sum);

    List<String> animals = List.of(
        "Panda", "Lion", "Giraffe",
        "Monkey", "Rat", "Monkey"
    );
//    Intermediate
    // limit - возвращает указанное количество элементов,
    // начиная с первого
    List<String> limited =
        animals.stream().limit(2).toList();
    System.out.println(limited);
    // skip - первые указанное элементов опускаются/пропускаются
    // если указали цифру 3 - первые три элемента будут пропущены
    List<String> skippedAnimals =
        animals.stream().skip(2).toList();
    System.out.println(skippedAnimals);
//    distinct == различные - оставит только уникальные элементы
    List<String> uniqueAnimals =
        animals.stream().distinct().toList();
    System.out.println(uniqueAnimals);
//    sorted -
//    Хочу отсортировать по количеству букв в словах
    List<String> sortedAnimal =
        animals.stream()
            .sorted(
                (a, b) -> Integer.compare(a.length(), b.length()))
//                Альтернативная версия: Comparator.comparingInt(String::length)
            .toList();
    System.out.println(sortedAnimal);
//    Terminal operations:
//    reduce, forEach - мы рассмотрели выше
//    findAny
    Optional<Panda> panda =
        pandas.stream()
            .filter(a -> a.getTitle().equals("Po")).findFirst();
//    anyMatch - проверяет если ли хотя бы один элемент, удовлетворяющий условию,
//    то есть предикату
    boolean poExist = pandas.stream()
        .anyMatch(a -> a.getTitle().equals("Po"));
    System.out.println(poExist);
//    allMatch - то же самое - но удовлетворяют ли все элементы условию?
    boolean allPandasArePo = pandas.stream()
        .allMatch(a -> a.getTitle().equals("Po"));
    System.out.println(allPandasArePo);
  }
}