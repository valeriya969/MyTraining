package lesson5.task20;

import java.util.Arrays;

public class SelectionSorterTest {
    public static void main(String[] args) {
        int[] array = {2, 1, 3, 4, 5, 26};
        SelectionSorter.sort(array);
        System.out.println(Arrays.toString(array));

    }
}
