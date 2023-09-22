/*
Предствьте, у вас есть робот, которвй понимает команды:
        'С' - шаг на север
        'Ю' - шаг на юг
        'З' - шаг на запад
        'В' - шаг на восток
        Команды робату поступают в виде строки вида "CЗВЗЗТЮ". Ояквидно, если в строке присутствуют рядом взаимопротиваположные команды например "ЗВ" или "СЮ" их можно сократить.
        Очевидно, что после сокращения, в строке опять взаимопротивоположные команды могут оказаться рядом, и их опять можно сократить.
        Например: "СВЮСЗ" превращается в "C"  ( "СВЮСЗ" -> "СВЗ" -> "С" ). Напишите метод, который оптимизирует строку команд для робота, сокращая лишние шаги.

        Примеры:
        "СЮСЗ" -> "СЗ"
        "СЮВЗ" -> ""
        "СВЮЗ" -> "СВЮЗ"
        "СВЗЮВЮЗССЮ" -> "ВЮЗС"

*/

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str = "СВЗЮВЮЗССЮ";
        System.out.println(stringOptimize(str));
    }

    public static String stringOptimize(String str){
        if(str==null||str.isEmpty()) return "";

        Map<Character, Character> pair = new HashMap<>();
        pair.put('С','Ю');
        pair.put('Ю','С');
        pair.put('В','З');
        pair.put('З','В');

        Deque<Character> stack = new LinkedList<>();

        for(Character ch:str.toCharArray()){
            if(pair.get(ch).equals(stack.peek())){
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        /*
        Character[] characters = new Character[stack.size()];
        characters= stack.toArray(characters);
        */

        /*
        Object[] array = stack.toArray();
        char[] array2 = new char[array.length];
        int i= array2.length-1;
        for (Object obj: array){
            array2[i--]=(Character)obj;
        };
        return new String(array2);
        */



        StringBuilder sb = new StringBuilder();
        for (char ch: stack){
            sb.append(ch);
        }





        return sb.reverse().toString();
    }
}

