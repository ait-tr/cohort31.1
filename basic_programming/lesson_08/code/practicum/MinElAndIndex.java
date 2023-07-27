package practicum;

public class MinElAndIndex {
    public static void main(String[] args) {
//        Задан массив целых чисел: 75, 34, -15, -123, 57, -145, 86, 77, 48, -59.
//        Найдите минимальный элемент массива и его индекс.

        int[] array = {75, 34, -15, -123, 57, -145, 86, 77, 48, -59};

        int i = 0; // индекс
        int min = array[0]; // как минимум взял 1-й элемент массива
        int pointer = 0; // указатель на элемент

        while (i < array.length) { // пока индекс меньше длины массива
            if (array[i] < min) { // если текущий элемент массива меньше min
                min = array[i]; // схватили элемент
                pointer = i; // схватили индекс
            }
            i++; // увеличиваем индекс
        }

        System.out.println("Min = " + min + ", index = " + pointer);

    }
}
