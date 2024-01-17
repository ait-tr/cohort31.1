import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("jack", "JOHN", "ann", "NiCK", "Stan");
        List<String> newList = handler(names, (String s) -> s.toUpperCase());
        System.out.println(newList);
        newList = handler1(newList, s->s.startsWith("J") );
        System.out.println(newList);

        System.out.println("--------------------------------");

        List<String> list = List.of("jack", "JOHN", "ann", "NiCK", "Stan");
        Predicate<String> predicate = s->s.startsWith("J");
        Function<String,String> transform = s -> s.toUpperCase();
        newList= handler1(handler(list,transform)  , predicate);
        System.out.println(newList);

        System.out.println(handler1(handler(list, transform), s -> s.length() > 3));

        System.out.println("----- consumer ----");
        newList.forEach(s-> System.out.println(s.length()));

        Supplier<List<String>> supplier= () -> new ArrayList<String>();
        Supplier<List<String>> supplier1= () -> List.of("1","2");
        Supplier<List<Integer>> supplier3= () -> {
            Random rnd= new Random();
            List<Integer> resList = new ArrayList<>();
            int size= rnd.nextInt(100);
            for (int i = 0; i < size ; i++) {
                resList.add(rnd.nextInt());
            }
            return resList;
        };






    }

    public void prodactionHandler(Supplier<List<Integer>> supplier){
        List<Integer> list = supplier.get();
        list.forEach(i-> System.out.println(i));
    }


    public  static <T> List<T> handler(List<T> list, Function<T,T> transformer){
        List<T> res= new ArrayList<>();
        for (T el:list) {
            res.add(transformer.apply(el));
        }
        return res;
    }

    public  static <T> List<T> handler3(List<T> list, UnaryOperator<T> transformer){
        List<T> res= new ArrayList<>();
        for (T el:list) {
            res.add(transformer.apply(el));
        }
        return res;
    }

    /*
        Predicate<T> - проверяем условие
        Function<T,R> - преобразование из типа T в тип R
        UnaryOperator<T> - частный случай Function<T,T>
        Consumer<T> - потребитель, принимает что-то и возвращает void
        Supplier<T> - поставщик

     */

    public static <T> List<T> handler1(List<T> list, Predicate<T> predicate){
        List<T> res= new ArrayList<>();
        for (T el:list) {
            if(predicate.test(el)) res.add(el);
        }
        return res;
    }




}