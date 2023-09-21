import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list1= List.of("1", "2", "3");
        List<String> list2= List.of("2", "1", "3");

        System.out.println(isCyclic(list1,list2));


    }
    public static boolean isCyclic(List<String> list1, List<String> list2){
        if(list1.size() != list2.size()) return false;

        Deque<String> queue1 = new LinkedList<>(list1);
        Deque<String> queue2 = new LinkedList<>(list2);

        for (int i = 0; i < list1.size()-1 ; i++) {
            queue1.addFirst(queue1.removeLast());
            if (queue1.equals(queue2)) {
                return true;
            }
        }

        return false;

    }


}