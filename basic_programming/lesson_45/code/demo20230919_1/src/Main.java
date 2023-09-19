import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //Deque<Integer> deque = new LinkedList();
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addFirst(4);
        System.out.println(deque);

        System.out.println("removeLast " + deque.removeLast());
        System.out.println(deque);

        // Stack
        //Deque<String> stack = new LinkedList();
        Deque<String> stack = new ArrayDeque<>();
        stack.push("s1");
        stack.push("s2");
        stack.push("s3");
        System.out.println(stack);
        System.out.println("pop " + stack.pop());
        System.out.println(stack);






    }
    }
