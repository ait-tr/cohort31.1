/*
Дана Map<String, String>, если в ней есть ключ "a" и "b", то нужно  создать новый ключ ‘ab’ с суммой значений от ключей a и b.
Примеры:
mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b":"There"}
mapAB({"a": "Hi"}) → {"a": "Hi"}
mapAB({"b": "There"}) → {"b": "There"}
 */

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("qwe","asdf");
        //map.put("a","Hi");
        map.put("b","There");
        map.put("qwe","jkk");

        System.out.println(map);
        mapAB2(map,"a","b");
        System.out.println(map);

    }

    public static void mapAB(Map<String, String> map, String key1, String key2) {

        if (map!=null && map.containsKey(key1) && map.containsKey(key2)) {
            map.put(key1+key2, map.get(key1) + map.get(key2));
        }

    }

    public static void mapAB2(Map<String, String> map, String key1, String key2) {
        if (map==null) return;
        String value1= map.get(key1);
        String value2= map.get(key2);
        if(value1!=null&&value2!=null){
            map.put(key1+key2, value1 + value2);
        }
    }

}