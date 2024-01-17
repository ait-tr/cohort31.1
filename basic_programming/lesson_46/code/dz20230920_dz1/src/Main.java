import java.util.*;

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
public class Main {
    public static final Map<Character,Character> pairToOpenBracket = Map.of(
            '(',')',
            '[',']',
            '{','}'
    );
    public static final Set<Character> closeBrackets = new HashSet<>(pairToOpenBracket.values());

    public static void main(String[] args) {
        System.out.println(checkBrackets("()[]{}")); //true
        System.out.println(checkBrackets("{()[fff]}")); //true
        System.out.println(checkBrackets("()[{}]")); //true
        System.out.println(checkBrackets("([]{}")); //false
        System.out.println(checkBrackets("()[{]}")); //false
        System.out.println(checkBrackets(")(")); //false
        System.out.println(checkBrackets("{{}")); //false
        System.out.println(checkBrackets(""));  // true

    }

    public static boolean checkBrackets(String str){
        if(str==null) return false;
        if(str.isEmpty()) return true;

        Deque<Character> stack = new LinkedList<>();

        for (char ch: str.toCharArray() ){
            Character bracket= pairToOpenBracket.get(ch);
            if(bracket!=null){
                stack.push(bracket);
            } else if(closeBrackets.contains(ch)  && ((stack.isEmpty() || ch!=stack.pop()))  ) {
                      return false;
            }
        }
        return stack.isEmpty();
    }






}