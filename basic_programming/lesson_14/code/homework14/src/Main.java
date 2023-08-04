import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] result = throwCube(10);
        // "[1, 2, 4, 5, 1, 6, 3, 5, 2, 2]";
        for (int element : result) {
            System.out.print(element + " ");
        }


        System.out.println("\nPrint array with Arrays.toString");
        System.out.println(Arrays.toString(result));

        String arrString = Arrays.toString(result);
        System.out.println(arrString.charAt(0));
        String str = "[1, 2, 4, 5, 1, 6, 3, 5, 2, 2]";

        System.out.println("result.toString()");
        System.out.println(result.toString());

        System.out.println("print Letters");
        System.out.println(Arrays.toString(randomLetters(20)));

        System.out.println("print words");
        System.out.println(Arrays.toString(randomWords(10)));


        System.out.println("----------task3-----------");
        System.out.println("print all dividers");
        System.out.println(Arrays.toString(findAllDividers(9)));

        System.out.println("-----task4------");

        int[] nums = {3, 1, 8, 9, 6};
        int[] res = findMaxMin(nums);

        System.out.println("min element = " + res[0] + " max element = " + res[1]);
        //   System.out.println("min element = "+findMaxMin(nums)[0] +
        //                           " max element = "+findMaxMin(nums)[1]);

    }

    /*
    Задача 1
Напишите метод, который имитирует бросание игрового кубика. На вход методу
подается число бросков, на выходе метод возвращает результаты всех бросков.
     */

    public static int[] throwCube(int numberOfTosses) {
        int[] result = new int[numberOfTosses];
        Random random = new Random();

        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(6) + 1;
        }
        return result;
    }


    /*
    Задача 2
Реализуйте метод, который заполняет массив случайными буквами. Размер массива подается на вход методу.
     */

    public static char[] randomLetters(int length) {
        char[] letters = new char[length];
        Random random = new Random();

        for (int i = 0; i < letters.length; i++) {
            letters[i] = (char) (random.nextInt(90 - 65) + 65);
            // letters[i]= (char)random.nextInt(65,90);
        }
        return letters;
    }

    char a = 'a';
    String aString = "a";

    public static String[] randomWords(int length) {
        String[] words = new String[length];
        Random random = new Random();

        for (int i = 0; i < words.length; i++) {
            //  words[i]=String.valueOf( (char) (random.nextInt(90 - 65)+65));
            words[i] = "Java" + (char) (random.nextInt(90 - 65) + 65);
            // letters[i]= (char)random.nextInt(65,90);


        }
        return words;
    }

    /*
    Задание 3
Реализовать метод, выводящий на экран все делители введенного пользователем целого числа.
Вернуть массив со всеми делителями числа.
     */

    public static int[] findAllDividers(int n) {

        int counter = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter++;
                System.out.print(i + " ");
            }
        }
        System.out.println();

        int[] dividers = new int[counter];

        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                dividers[index] = i;
                index++;
            }
        }
        return dividers;
    }

    /*
    Задача 4 (*)
Написать метод, возвращающий минимальный и максимальный элемент
из поданного ему на вход массива целых чисел.
     */

    public static int[] findMaxMin(int[] numbers) {
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        //  int[] minMax ={min,max} ;
        return new int[]{min, max};
    }


}
