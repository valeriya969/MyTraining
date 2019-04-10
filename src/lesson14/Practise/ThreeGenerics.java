package lesson14.Practise;

import java.io.Serializable;

public class ThreeGenerics<T extends Comparable, V extends Animal & Serializable, K extends Number> {
    private T ob1;
    private V ob2;
    private K ob3;

    public ThreeGenerics(T ob1, V ob2, K ob3) {
        this.ob1 = ob1;
        this.ob2 = ob2;
        this.ob3 = ob3;
    }

    void showTypes() {
        System.out.println("Type of T is "
                + ob1.getClass().getName());

        System.out.println("Type of V is "
                + ob2.getClass().getName());

        System.out.println("Type of K is "
                + ob3.getClass().getName());
    }

    public T getOb1() {
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }

    public K getOb3() {
        return ob3;
    }

    public static void main(String[] args) {
        ThreeGenerics<String, Dog, Integer> threeGenerics1 = new ThreeGenerics<>("asd", new Dog(), 5);
        threeGenerics1.showTypes();
    }
}
