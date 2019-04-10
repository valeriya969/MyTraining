package lesson5.task16;

import lesson5.task15.BubbleSort;

import java.util.Arrays;

public class BubbleSortTest1 {
    public static void main(String[] args) {
        int[] array1 = {45, 67, 32, 15, 101, 3, 14};
            System.out.print(Arrays.toString(array1)+" =>");
            BubbleSort.sort(array1);
            System.out.println(Arrays.toString(array1));


    }
}

