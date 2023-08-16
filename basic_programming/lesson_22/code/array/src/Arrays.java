public class Arrays {

    public static int search(int[] array, int value){
        for (int i=0; i<array.length; ++i){
            if(array[i]==value){
                return i;
            }
        }
        return -1;
    }
    // array is the SORTED array!!!
    public static  int binarySearch(int[] array, int value){
        int left=0;
        int right=array.length-1;

        while (left<=right) {
            //int mid = (right + left) / 2;

            int mid = left+(right-left)/2;
            if (array[mid] == value) return mid;
            if (array[mid] < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }


    public static void bubbleSort(int[] array){
        for (int i = 0; i <array.length-1 ; i++) {

            boolean isSorted=true;
            System.out.println("Run......");

            for (int j = 0; j <array.length-1-i; j++) {
                if(array[j]>array[j+1]){
                    swap(array,j,j+1);
                    isSorted = false;
                }
            }

            if(isSorted) return;
        }
    }

    private static void swap(int[] array, int i1, int i2) {
        int temp = array[i1];
        array[i1]=array[i2];
        array[i2]=temp;
    }


}
