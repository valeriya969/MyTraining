package lesson5.task20;

public class SelectionSorter {
    public static void sort(int[] array){
        for (int i = 0; i<array.length; i++){
            int pos = i;
            int min = array[i];
            boolean b = false;
            for (int j = i+1; j < array.length; j++){
                if (array[j] < min){
                    min = array[j];
                    pos = j;
                    b = true;
                }
            }
            if (b){
            array [pos] = array[i];
            array [i]= min;
        }
    }
}
}


