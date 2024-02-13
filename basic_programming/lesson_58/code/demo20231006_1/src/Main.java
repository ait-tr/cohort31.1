import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
map
filter
toList
forEach
collect( Collectors.toCollection(  ) )
collect( Collectors.toSet(  ) )
flatMap()
 */


public class Main {
    public static void main(String[] args) {
        //Stream
        List<Integer> list = List.of(2, 3, 6, 23, 1, -3, 0);

        // 1
        System.out.println("----------------------------------");
        list.stream()
                //.map(i->String.valueOf(i)+"q")
                //.map(s->s.length())
                .map(i->Integer.toBinaryString(i))
                .forEach(s-> System.out.println(s));

        // 2
        System.out.println("--------------------------");
        List<String> list1 = list.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> Integer.toBinaryString(i))
                .toList();
        System.out.println(list1);
        list1.forEach(s-> System.out.print(s));

        System.out.println("---------------- 3 ---------------------");
        List<Person> listPerson = List.of(
                new Person("Ivan", "Polyakov", "ivan@gmail.com", "+3241512",
                        new Address("124524", "Moscow", "Bolotnaya", "24-1")),
                new Person("fName1", "lName1", "ivan@gmail.com", "+3241512",
                        new Address("124524", "Moscow", "Bolotnaya", "24-1")),
                new Person("fName2", "lName2", "ivan2@gmail.com", "+2222",
                        new Address("124524", "Moscow", "Bolotnaya", "25-1")),
                new Person("Jack", "London", "jack@gmail.com", "+512412",
                        new Address("42151", "London", "Compton", "+24125412")));


        List<String> strings = listPerson.stream()
                .map(p -> p.getfName() + " " + p.getlName())
                .toList();
        System.out.println(strings);

        strings = listPerson.stream()
                .map(p -> p.getEmail())
                .toList();
        System.out.println(strings);

        Set<String> set1 = listPerson.stream()
                .map(p -> p.getEmail())
                .collect(Collectors.toSet());
        System.out.println(set1);

        listPerson.stream()
                .map(p -> p.getEmail())
                .collect(Collectors.toCollection(()-> new LinkedHashSet<>()));
        System.out.println(set1);


        List<Student> students = List.of(
                new Student("jack", List.of(1, 2, 3)),
                new Student("jack1", List.of(5, 2)),
                new Student("jack2", List.of(2, 2, 3))
        );

        System.out.println(students.stream()
                .map(s -> s.getName())
                .toList());

        List<List<Integer>> list2 = students.stream()
                .map(s -> s.getRate())
                .toList();

        System.out.println(students.stream()
                .flatMap(s -> s.getRate().stream())
                .sorted()
                .filter(i->i==2)
                .toList());
    }


}