package lesson5.task17;

import java.util.Arrays;

public class ArrayMaxMin {
    public static void main(String[] args) {
        double[][] array1 = {
                {5, 10, 13, 26, 14, 89.5, 77.3, 4},
                {67, 1001, 13, 5, 77.9, 103.1, 34, 6},
                {67, 78, 90, 1, 22, 1.2, 0.8, 345667},
                {44, 5, 7, 4, 6, 33.5, 15, 236},
                {45555, 78, 56, 78.5, 3, 67, 8, 0},
        };
        double[][] array2 = new double[array1.length][2];
        for (int i = 0; i < array1.length; i++) {
            double min = Double.MAX_VALUE;
            for (int j = 0; j < array1[0].length; j++) {
                if(array1[i][j] < min){
                    min = array1[i][j];
                    array2[i][0] = min;
                }
            }
        }
        for (int i = 0; i < array1.length; i++) {
            double max = Double.MIN_VALUE;
            for (int j = 0; j < array1[0].length; j++) {
                if(array1[i][j] > max){
                    max = array1[i][j];
                    array2[i][1] = max;
                }
            }
        }
        System.out.println(Arrays.deepToString(array1));
        System.out.println(Arrays.deepToString(array2));
    }
}




