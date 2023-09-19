import java.util.*;

/*
Задача
    Дана  Map <Character, Integer>. Необходимо сформировать случайную строку, где
    соответствующая буква будет встречаться заданное количество  раз.
    {A->2, b->1, k->2, c->3, ‘ ‘->2 } -> “ck cca k”

    {a->2, b->1, k->2, c->3, ‘ ‘->2 } -> “ck acca k”

 */
public class Main {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('a',2);
        map.put('c',3);
        map.put(' ',1);
        map.put('k',2);


        System.out.println(generateString(map));


    }
    public static String generateString(Map<Character,Integer> map){
        if(map==null) return "";
        List<Character> list=new ArrayList<>();
        for (Map.Entry<Character,Integer> entry: map.entrySet()){
           int count=entry.getValue();
           Character ch= entry.getKey();
           while (count>0){
               list.add(ch);
               count--;
           }
        }

        Collections.shuffle(list);
        StringBuilder sb= new StringBuilder();
        for (Character ch:list){
            sb.append(ch);
        }

        return sb.toString();


    }
}