package lesson9.Test1;

import lesson9.Test.A;

public class D extends A {

    public D(int i, int a, int b, int c) {
        super(i, a, b, c);
    }

    public static void main(String[] args) {
        D object4=new D(4,5,6,7);
        System.out.println(object4.a+object4.c);
    }
}
