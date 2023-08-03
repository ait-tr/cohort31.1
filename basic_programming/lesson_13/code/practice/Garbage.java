package practice;

import java.util.Scanner;

public class Garbage {
    public static void main(String[] args) {
//        Написать метод, который получает на вход вид выбрасываемого мусора (слово), а возвращает
//        цвет урны, в которую его надо выбросить. Протестировать метод, вызвав его в методе main.

        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you have - paper, bio, rest? " );
        String w = scanner.nextLine();
        String respond = garbage(w);

        System.out.println(respond);

    }
    // =============Methods===============
    public static String garbage(String g) {

        switch (g){
            case "paper":
                return "blau";
            case "bio":
                return "braun";
            case "rest" :
                return "black";
            default:
                return "Bring package back home!";
        }
    }

    //====================================
}
