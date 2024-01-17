package practice.unit_tests;

public class ArraySum {
    public static void main(String[] args) {
//        Задайте массив на 10 элементов и заполните его случайными числами в интервале от -10 до 10.
//        Распечатайте полученный массив.
//        Найдите сумму элементов массива c нечетными индексами.
//        Разработайте соответсвующий тест (набор тестов).
        // (int) (Math.random() * (b - a + 1) + a);

        int[] array = new int[10];
        int a = -10;
        int b = 10;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        printArray(array);

        int res = sumElOddIndex(array);
        System.out.println("Sum of... " + res);

    }

    //===========Methods============

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int sumElOddIndex(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0 ) {
                sum = sum + arr[i];
            }
        }
        return sum;
    }

}
