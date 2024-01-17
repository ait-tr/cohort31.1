/*
    В программе задан список Person{ String fName, String lName, String email, String phone, Address address}.
  Класс адрес в Person это:  Address{String postcode, String city, String street, String house}

  Реализовать следующие функции:
     -получить список всех ФИО   List<String>  ..... (List<Person>)
     -получить список всех e-mail  List<String>  ..... (List<Person>)
     -получить список всех телефонов List<String>  ..... (List<Person>)
     -получить список всех адресов в виде строки адреса List<String>  ..... (List<Person>)

    Естественно, все вышеперечисленные функции может и должен реализовать один метод, в который в качестве параметра должен приходить список Person и реализация необходимого способа обработки.

2.
Добавить в ваш метод возможность отфильтровать список, т.е. возможность получить список не всех ФИО, а только список ФИО содержащих заданную строку, или начинающихся на заданную. букву



   */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> list = List.of(
                new Person("Ivan", "Polyakov", "ivan@gmail.com", "+3241512",
                        new Address("124524", "Moscow", "Bolotnaya", "24-1")),
                new Person("Jack", "London", "jack@gmail.com", "+512412",
                        new Address("42151", "London", "Compton", "+24125412")));

        List<String> res = handler(list, p -> p.getfName() + " " + p.getlName()  );
        System.out.println(res);
        res = handler(list, p->p.getEmail()  );
        System.out.println(res);
        res = handler(list, p->p.getPhone()  );
        System.out.println(res);
        res = handler(list, p->p.getAddress().toString()  );
        System.out.println(res);

        res = genericHandler(list,
                p->p.getAddress().toString(),
                p->p.getlName().equals("London")  );
        System.out.println(res);


        List<Address> addresses = genericHandler(list, p -> p.getAddress(), p->true);
        System.out.println(addresses);

        List<Integer> list1 = genericHandler(List.of("1", "2", "3", "4"), s -> Integer.parseInt(s), s -> true);
        System.out.println(list1);

    }



    public static List<String> handler(List<Person> list, Function<Person, String> function){
        /*
        List<String> result = new ArrayList<>();
        if(list==null || list.isEmpty()) return result;

        for (Person p:list){
            //  Person   ->     String
            String str = function.apply(p);
            result.add(str);
        }
    return result;
         */
        return handler(list, function, p->true);
    }

    public static List<String> handler(List<Person> list, Function<Person, String> function, Predicate<Person> predicate){
        List<String> result = new ArrayList<>();
        if(list==null || list.isEmpty()) return result;

        for (Person p:list){
            if (predicate==null || predicate.test(p)){   ///  Person  -> boolean
                //  Person   ->     String
                String str = function.apply(p);
                result.add(str);
            }
        }
        return result;
    }

    // T -тип исходных данных
    // R -тип результата
    public  static <T,R> List<R> genericHandler(List<T> list, Function<T, R> function, Predicate<T> predicate){
        List<R> result = new ArrayList<>();
        if(list==null || list.isEmpty()) return result;

        for (T el:list){
            if (predicate==null || predicate.test(el)){   ///  T  -> boolean
                //  T   ->     String
                R obj = function.apply(el);
                result.add(obj);
            }
        }
        return result;
    }



}