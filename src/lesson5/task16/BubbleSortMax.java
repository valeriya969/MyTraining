package lesson5.task16;

import java.util.Arrays;

public class BubbleSortMax {
    public static void sortmax(int[] array) {
//        int k = array.length;
//        for( int i = 0; i < array.length; i++){
//            for( int j = 0; j<k-1; j++){
//                if (array[j] < array[j+1]){
//                    int tmp = array[j+1];
//                    array[j+1] = array[j];
//                    array[j] = tmp;
//                }
//            }
//            k = k -1;
//        }
        int k = array.length;
        boolean b = true;
        while(b) {
            b =false;
            for (int j = 0; j < k-1; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                    b = true;
                }
            }
            k = k - 1;
        }
    }

    public static void main(String[] args) {
        int a[] = {1,5,4,3};

        sortmax(a);
        System.out.println(Arrays.toString(a));

    }
}