import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[][]{{0,1,2,3,4,5}, {3,2,1,1,2,3}, {1,1,2,2,3,3} };
        print(array);
        System.out.println("----------------------------");
        int[][] result = task(array);
        print(result);


    }

    private static void print(int[][] array) {
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    private static int[][] task(int[][] array){
        int[][] result = new int[array.length+1][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                result[i][j] = array[i][j];
            }
        }

        for (int j = 0; j < array[0].length; j++) {
            int sum=0;
            for (int i = 0; i < array.length ; i++) {
                sum+=array[i][j];
            }
            result[result.length-1][j]=sum;
        }
        return result;
    }
}