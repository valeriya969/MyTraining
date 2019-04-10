package lesson9.Test;

public class B extends A {
    private int p;

    public B(int i, int a, int b, int c, int p) {
        super(i, a, b, c);
        this.p = p;
    }

    public static void main(String[] args) {
        B object1 = new B(3,5,6,7,8);
        System.out.println(object1.getI()+ object1.a+object1.p+object1.b+object1.c);
    }
}
