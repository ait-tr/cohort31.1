import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MyHashSet<E> {
    private Map<E, Object> map = new HashMap<>();


    public boolean add(E element){
        map.put(element,null);
        return true;
    }
    public boolean contains(E element){
        return map.containsKey(element);
    }

    public String toString(){
        StringBuilder stringBuilder=new StringBuilder();
        for (Map.Entry<E,Object> entry: map.entrySet()){
            stringBuilder.append(entry.getKey()).append(" ");

        }
        return stringBuilder.toString();
    }


}