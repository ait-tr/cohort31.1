import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Map<String, String> map1= new HashMap<>();
        Map<String, Person> map2= new HashMap<>();
        Map<Person, Integer> map3= new HashMap<>();
        Map<String, List<Person>> map4= new HashMap<>();
        //Map<List<Person>, String> map5= new HashMap<>();


        map1.put("qwe1","123-123123");
        map1.put("qwe2","123-123123782431");
        map1.put("qwe3","123-7373");
        map1.put("qwe4","12773");
        //map1.put("qwe4","127737");

        System.out.println(map1);


        //
        System.out.println(map1.get("qwe3"));


        // iterate map

        Set<String> keysMap1 = map1.keySet();
        for(String key:keysMap1){
            System.out.println(key+ " "+ map1.get(key));
        }
        System.out.println("---------------------------");

        Set<Map.Entry<String, String>> entriesMap1 = map1.entrySet();
        for (Map.Entry<String, String> entry : entriesMap1){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        Person person = new Person("Jack", 21);
        List<Person> people = List.of(
                new Person("Jack", 21),
                new Person("John", 23),
                new Person("Nick", 21),
                new Person("Ann", 19)
        );

        for (Person p: people){
            map3.put(p,p.getAge());
        }
        System.out.println(map3);


        map3.put(person,person.getAge());
        System.out.println(map3);




    }
}