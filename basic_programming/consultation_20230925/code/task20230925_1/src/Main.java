import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Jack", "Nikolaus", "Elena", "John", "Kim"));
        //List<String> list = List.of("Jack", "Nikolaus", "Elena", "John", "Kim");
        System.out.println(listWithoutShortNames4(list));

    }

public static List<String> listWithoutShortNames(List<String> list){
        for (String str: list){
            if(str.length()==4){
                list.remove(str); // java.util.ConcurrentModificationException
            }
        }
        return  list;
    }

    public static List<String> listWithoutShortNames2(List<String> list){
        List<String> result = new ArrayList<>();
        for (String str: list){
            if(str.length()!=4){
                result.add(str);
            }
        }
        return  result;
    }

    public static List<String> listWithoutShortNames3(List<String> list){
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            if(iterator.next().length()==4){
                iterator.remove();
            }
        }
        return  list;
    }

    public static List<String> listWithoutShortNames4(List<String> list){
        ArrayList<String> res = new ArrayList<>(list);
        res.removeIf(s -> s.length()==4);
        return res;
    }


}

