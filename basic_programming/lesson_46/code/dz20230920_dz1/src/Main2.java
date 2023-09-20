import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/*
Дана строка - скобочная последовательность ( строка состоящая из скобок трех видов *() [] {}  )
Написать метод (алноритм обсуждали в классе) который проверит прпвилтность расстановки скобок.

        ( {} [] ) -> true
        ( {} [ ) -> false
        ( } [] ) -> false
        { ( } [] ) -> false

        "{ ( ][ ( ) ] }"

        1. если openBracket  - > push pair close Bracket
        2. если closeBracket  - > cравниваем (pop) с вершиной стека
           если не совпало - return false
        3. check if stack empty


*/
public class Main2 {


    public static void main(String[] args) {
        System.out.println(checkBrackets("()[]{}")); //true
        System.out.println(checkBrackets("{()[]}")); //true
        System.out.println(checkBrackets("()[{}]")); //true
        System.out.println(checkBrackets("([]{}")); //false
        System.out.println(checkBrackets("()[{]}")); //false
        System.out.println(checkBrackets(")(")); //false
        System.out.println(checkBrackets("{{}")); //false
        System.out.println(checkBrackets(""));  // true

    }

    public static boolean checkBrackets(String brecketStr){
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put(']', '[');
        brackets.put('}', '{');

        Deque<Character> stack = new LinkedList<>();
        for (Character c: brecketStr.toCharArray()) {
            if (brackets.containsValue(c)){
                stack.push(c);
            } else if (brackets.containsKey(c)){
                if (stack.isEmpty() || stack.pop() != brackets.get(c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }




}