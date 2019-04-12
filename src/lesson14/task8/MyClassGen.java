package lesson14.task8;

public class MyClassGen<T extends Comparable<T>> implements MinMax<T> {
    private T[] massive;

    public MyClassGen(T[] massive) {
        this.massive = massive;
    }

    @Override
    public T min() {
        T min = massive[0];
        for (int i = 0; i < massive.length; i++) {
            if (massive[i].compareTo(min) < 0) {
                min = massive[i];
            }
        }
        return min;
    }

    @Override
    public T max() {
        T max = massive[0];
        for (int i = 0; i < massive.length; i++) {
            if (massive[i].compareTo(max) > 0) {
                max = massive[i];
            }
        }
        return max;
    }
}
