package practicum;

public class Marks {
    public static void main(String[] args) {

//        Имеются оценки абитуриента из его аттестата, всего 12 оценок.
//        Найдите средний балл абитуриента.

        // 1, 2, 3, 4, 5 - так выглядят оценки

        int[] marksArr = {4, 5, 2, 1, 1, 3, 2, 5, 1, 1, 2, 1}; // - это прямое заполнение массива в коде

        int l = marksArr.length;
        System.out.println("Length of array is : " + l);

        // надо сложить все элементы массива, потом разделить на его размер
        // организуем цикл while
        int sum = 0; // в эту переменную будем накапливать сумму
        int i = 0; // это переменная для индекса, параметр цикла

        while ( i < marksArr.length) { // пробегаем по всем элементам массива
            sum = sum + marksArr[i]; // накапливаем сумму значений элементов в переменной
            i++;
        }

        double averageMark = (double) sum / (double) marksArr.length; // вычисляем средний балл
        System.out.printf("Average mark: %.2f" , averageMark);

    }
}
