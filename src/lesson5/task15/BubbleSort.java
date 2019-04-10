package lesson5.task15;

import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {1,4,2,5,-45,12,4,0,89,45454,1,7,89};

        sort(a);
        System.out.println(Arrays.toString(a));

    }

    }
