import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
Дан List<Integer>. Написать метод, который определит, есть лм в этом списке такая пара чисел, которые в сумме дабт заданное число N.

 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>( List.of(-1, 6, -5, 7, 4, 2, -1, 0) );

        System.out.println(isPairEqualsNumber(list, 7)); // true
        System.out.println(isPairEqualsNumber(list, 1)); // true
        System.out.println(isPairEqualsNumber(list, 16)); // false
        System.out.println(isPairEqualsNumber(list, -1));// true
        System.out.println("---------------");
        System.out.println(isPairEqualsNumber3(list, 7)); // true
        System.out.println(isPairEqualsNumber3(list, 1)); // true
        System.out.println(isPairEqualsNumber3(list, 16)); // false
        System.out.println(isPairEqualsNumber3(list, -1));// true

        System.out.println("---------------");
        System.out.println(isPairEqualsNumber4(list, 7)); // true
        System.out.println(isPairEqualsNumber4(list, 1)); // true
        System.out.println(isPairEqualsNumber4(list, 16)); // false
        System.out.println(isPairEqualsNumber4(list, -1));// true


    }

    public static boolean isPairEqualsNumber(List<Integer> list, int num){
        if(list==null || list.size()<2) return false;

        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i+1; j < list.size() ; j++) {
              if(list.get(i)+list.get(j) == num) {
                  return true;
              }
            }
        }

        return false;
    }


    // !!!not good!
    public static boolean isPairEqualsNumber2(List<Integer> list, int num){
        if(list==null || list.size()<2) return false;

        for (int i = 0; i < list.size(); i++) {
            Integer pair = num - list.get(i); // pair + list.get(i) = num
            if(list.contains(pair)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPairEqualsNumber3(List<Integer> list, int num){
        if(list==null || list.size()<2) return false;
        HashSet<Integer> wishNumbersSet = new HashSet<>();
        for (Integer i: list) {
            if (wishNumbersSet.contains(i)){
                return true;
            } else {
                wishNumbersSet.add(num - i);
            }
        }

        return false;
    }

    public static boolean isPairEqualsNumber4(List<Integer> list, int num){
        if(list==null || list.size()<2) return false;
        list.sort((a,b)->a-b);
        int lIndex= 0;
        int rIndex=list.size()-1;

        while (lIndex<rIndex){
            int sum=list.get(lIndex)+list.get(rIndex);
            if(sum==num){
                return true;
            }
            if(sum<num){
                lIndex++;
            } else {
                rIndex--;
            }
        }


        return false;
    }



}