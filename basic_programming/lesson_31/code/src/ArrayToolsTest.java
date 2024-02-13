package ait.arrays.test;

import ait.arrays.utils.ArrayTools;
import ait.soldier.model.Soldier;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayToolsTest {
    Integer[] arrNum;
    String[] arrStr;
    Soldier[] soldiers;


    @BeforeEach
    void setUp() {
        arrNum = new Integer[]{9, 7, 4, 7, 2, 5, 1, 0};
        arrStr = new String[]{"one", "two", "three", "four", "five"};
        soldiers = new Soldier[]{
                new Soldier("John", 182, 82.3, 91),
                new Soldier("Peter", 175, 77.1, 75),
                new Soldier("Rabindranate", 162, 55.1, 91),
                new Soldier("Mary", 159, 55.1, 91),
                new Soldier("Ann", 162, 55, 88)
        };
    }

    @Test
    void testPrintArray() {
        System.out.println("===== testPrintArray =====");
        ArrayTools.printArray(arrNum);
        ArrayTools.printArray(arrStr);
    }

    @Test
    void testSearch() {
        System.out.println("===== testSearch =====");
        int index = ArrayTools.search(arrStr, "four");
        System.out.println("index = " + index);
        index = ArrayTools.search(arrStr, "six");
        System.out.println("index = " + index);
        index = ArrayTools.search(arrNum, 4);
        System.out.println("index = " + index);
        index = ArrayTools.search(arrNum, 6);
        System.out.println("index = " + index);
    }

    @Test
    void testFindByPredicate() {
        System.out.println("===== testFindByPredicate =====");
        Integer res = ArrayTools.findByPredicate(arrNum, n -> n < 5);
        System.out.println(res);
        res = ArrayTools.findByPredicate(arrNum, n -> n % 5 == 0);
        System.out.println(res);
        String str = ArrayTools.findByPredicate(arrStr, s -> s.length() == 4);
        System.out.println(str);
    }

    @Test
    void testBubbleSort() {
        System.out.println("===== testBubbleSort =====");
//        ArrayTools.bubbleSort(arrNum);
        Arrays.sort(arrNum);
        ArrayTools.printArray(arrNum);
//        ArrayTools.bubbleSort(arrStr);
        Arrays.sort(arrStr);
        ArrayTools.printArray(arrStr);
//        ArrayTools.bubbleSort(soldiers);
        Arrays.sort(soldiers);
        ArrayTools.printArray(soldiers);
    }

    @Test
    void testSortSoldiersByName() {
        System.out.println("===== testSortSoldiersByName =====");
//        ArrayTools.bubbleSort(soldiers, (s1, s2) -> s1.getName().compareTo(s2.getName()));
        Arrays.sort(soldiers, (s1, s2) -> s1.getName().compareTo(s2.getName()));
        ArrayTools.printArray(soldiers);
    }

    @Test
    void testSortSoldiersByProfile() {
        System.out.println("===== testSortSoldiersByProfile =====");
//        ArrayTools.bubbleSort(soldiers, (s1, s2) -> s1.getProfile() - s2.getProfile());
        Arrays.sort(soldiers, (s1, s2) -> s1.getProfile() - s2.getProfile());
        ArrayTools.printArray(soldiers);
    }

    @Test
    void testSortSoldiersByWeight() {
        System.out.println("===== testSortSoldiersByWeight =====");
//        ArrayTools.bubbleSort(soldiers, (s1, s2) -> {
//            double res = s1.getWeight() - s2.getWeight();
//            if (res < 0) {
//                return -1;
//            }
//            if (res > 0) {
//                return 1;
//            }
//            return 0;
//        });
        Arrays.sort(soldiers, (s1, s2) -> {
            double res = s1.getWeight() - s2.getWeight();
            if (res < 0) {
                return -1;
            }
            if (res > 0) {
                return 1;
            }
            return 0;
        });
        ArrayTools.printArray(soldiers);
    }

    @Test
    void testSortStringByLength() {
        System.out.println("===== testSortStringByLength =====");
//        ArrayTools.bubbleSort(arrStr, (s1, s2) -> s1.length() - s2.length());
        Arrays.sort(arrStr, (s1, s2) -> s1.length() - s2.length());
        ArrayTools.printArray(arrStr);
    }
}