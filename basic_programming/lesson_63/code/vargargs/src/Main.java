import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
  public static void main(String[] args) {
    print("apple");
    print("apple", "orange");
    print("apple", "orange", "pear");
//    создайте метод, который принимает произвольное количество int
//    возвращает их сумму
//    sumArguments
//     sumArguments(1, 2, 3)  --> 6
//     sumArguments(1, 2)  --> 3
//    2. Метод принимает произвольное количество стрингов
//    - возвращает лист из этих значений
//    bundle
//    3.* Метод принимает цифру - это длина и произвольное число строк -
//    возвращает первую попавшуюся из этих строк - с указанной длинной.
    System.out.println(Arrays.toString(getArr(3,4,5)));
    List<String> list = bundle("Apple", "Orange");
    System.out.println(list);
    list.add("Pear");
    System.out.println(list);

    String word = getWordOfLength(3, "Apple", "Orange", "Lime");
    System.out.println(word);
  }

  public static int sumArguments(int ...numbers){
    int acc = 0;
    for (int n: numbers){
      acc += n;
    }
    return acc;
  }
  public static List<String> bundle(String ...args){
    return new ArrayList<>(Arrays.asList(args));
  }
  public static String getWordOfLength(int length, String ...words){
    for(String w:words){
      if (w.length() == length){
        return w;
      }
    }
    return null;
  }
  public static Optional<String> getOptionalOfWordOfLength(int length, String ...words){
    for(String w:words){
      if (w.length() == length){
        return Optional.of(w);
      }
    }
    return Optional.empty();
  }
  public static int[] getArr(int ...numbers){
    numbers[0] = 10;
    return numbers;
  }

  public static void print(String ...args){
    for (String arg : args) {
      System.out.println(arg);
    }
  }
}