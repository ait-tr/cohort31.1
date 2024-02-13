import java.util.*;

/*
Дана String с произвольным текстом (без знаков препинания слова разделены пробелом). Необходимо получить map, где ключем будет выступать первая буква слова,
а значением, список слов начинающихся на эту букву

 */
public class Main {
    public static void main(String[] args) {

        String text = "hashCode hashCode method is used to get the hash code of an object "
                + "hashCode method of the object class returns the memory reference of an object in integer form "
                + "Definition of hashCode method is public native hashCode It indicates the implementation "
                + "of hashCode is native because there is not any direct method in java to fetch the reference "
                + "of the object It is possible to provide your implementation of hashCode"
                + "In HashMap hashCode is used to calculate the bucket and therefore calculate the index";

        List<String> words = stringToListWords(text);
        System.out.println(collectionHandler(removeDuplicate(words)));
    }

    public static Set<String> removeDuplicate(Collection<String> collection){
        return new HashSet<>(collection);
    }

    public static List<String> stringToListWords(String text){
        if (text==null) return Collections.emptyList();
        return Arrays.asList(text.split(" "));
    }

    public static String textPreHandler(String text){
        return text.toLowerCase();
    }

    public static Map<Character, List<String>> collectionHandler(Collection<String> collection) {
        Map<Character, List<String>> result = new HashMap<>();
        if (collection== null) return result;

        for (String str: collection){
            Character key = str.charAt(0);
            result.putIfAbsent(key, new ArrayList<>());
            //if(!result.containsKey(key)) result.put(key,new ArrayList<>());
            result.get(key).add(str);
        }

        return result;
    }


}