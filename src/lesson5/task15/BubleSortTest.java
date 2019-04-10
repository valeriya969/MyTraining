package lesson5.task15;

import java.util.Arrays;

public class BubleSortTest {
    public static void main(String[] args) {
        int[][] data = {
                {9, 15, 7, 2},
                {13, 12, 17, 6, 8, 9},
                {78, 45, 3, 67, 7}
        };
        for (int[] str : data) {
            System.out.print(Arrays.toString(str)+" =>");
            BubbleSort.sort(str);
            System.out.println(Arrays.toString(str));
        }

    }
}