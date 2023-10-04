import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    /*
    **Задача 1**
Создать двумерный массив 5x3 т.е. 5 строк 3 столбца. Заполнить его случайными числпми.
- Написать метод, который преобразует его в одномерный массив из 15 элементов, перенося числа по-порядку (слева направо и сверху вниз) из исходного
- Написать метод, который меняет все значения из первой строки, на соответствующие значения из 3 строки, а значения из третьей строки на значения из первой. Т.е. в итоге нужно поменять местами первую и третью строки исходного массива.

**Задача 2**
Дан массив строк. Каждую строку из этого массива нужно преобразовать в массив байт (см. метод getBytes у строки). Получить двумерный массив byte[][] такой, где каждая строка -
это массив байта, полученный преобразованием соответствуюшей String из данного массива строк.

**Задача 3**
Записать каждую строку двумерного массива byte[][] (например, из второй задачи) в отдельный файл.


     */

    public static void main(String[] args) {
        //int[][] arr = { {3,4,3}, {5,3,2}      };
        int[][] array = createArrayAndFill(5, 3);
        print(array);
        System.out.println("--------------------------------");
        System.out.println(Arrays.toString(toArray(array)));
        System.out.println("--------------------------------");
        changeRows(array,1,3);
        print(array);
        System.out.println("---------------------------------");
        byte[][] bytes = listStringToByteArray(List.of("qwe1", "qwe2", "при1"));
        System.out.println(Arrays.deepToString(bytes));
        arrayToFile(bytes);


    }
    public static int[][] createArrayAndFill(int row, int col){
        int[][] arr = new int[row][col];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {  // arr.length - количество строк
            for (int j = 0; j < arr[i].length ; j++) {
                arr[i][j]=rnd.nextInt(50);
            }
        }
        return arr;
    }
    public static void print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {  // arr.length - количество строк
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.printf("%3d ", arr[i][j] );
            }
            System.out.println();
        }
    }

    public static int[] toArray(int[][] arr){
        int[] result = new int[arr.length*arr[0].length];
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                result[index++] = arr[i][j];
            }
        }
        return result;
    }

    public static void changeRows(int[][] arr, int row1, int row2){
        if(row1<0 || row2<0 || row1>= arr.length || row2>= arr.length){
            throw new IllegalArgumentException();
        }
        /*
        for (int j = 0; j < arr[row1].length ; j++) {
            int temp = arr[row1][j];
            arr[row1][j] = arr[row2][j];
            arr[row2][j]=temp;
        }
         */
        int[] temp;
        temp = arr[row1];
        arr[row1] = arr[row2];
        arr[row2] = temp;
    }

    public static byte[][] listStringToByteArray(List<String> list){
        byte[][] result = new byte[list.size()][];
        int rowIndex=0;
        for (String str:list) {
            result[rowIndex++] = str.getBytes();
        }
      return result;
    }

    public static void arrayToFile(byte[][] arr){
        for (int i=0; i<arr.length;i++){
            byte[] currentArray=arr[i];
            try (BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream("file_" + i))) {
                os.write(currentArray);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }


}