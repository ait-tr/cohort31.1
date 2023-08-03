package practice;

public class Coin {
    public static void main(String[] args) {
//        бросание монеты
//        На вход методов подается ко-во попыток, метод должен вернуть результаты попыток.
//        орел и решка n = (int)(Math.random() * (1 - 0 + 1) + 0)

        int[] game = new int[10]; // объявили массив
        game = coins(20);

        for (int i = 0; i < game.length; i++) {
            System.out.print(game[i] + " | ");
        }

    }
    // ==============Methods===============

    public static int[] coins(int n) {
        int[] с = new int[n];
        for (int i = 0; i < n; i++) {
            с[i] = (int)(Math.random() * (1 - 0 + 1) + 0);
        }
        return с;
    }

    // =====================================
}
