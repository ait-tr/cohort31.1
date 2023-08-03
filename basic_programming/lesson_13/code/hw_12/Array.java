package hw_12;

public class Array {
//    Написать метод, проверяющий содержатся ли в массиве целых чисел 0 или -1. Если да, метод возвращает true,
//    если нет false.
//    static boolean checkOnesAndZeros( int[] ints)
//    В методе main()  вывести получившийся результат на экран

    public static void main(String[] args) {
        int[] array = {999, 23, 28, 0, -38, 8, -1, 1001, 56};

        System.out.println(checkOnesAndZeros(array));

    }
    //============ Methods =======================
    public static boolean checkOnesAndZeros( int[] ints) {
        boolean flag = false;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == 0 || ints[i] == -1) {
                flag = true;
            }
        }
        return flag;
    }


    //============================================
}
