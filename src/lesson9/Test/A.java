package lesson9.Test;

public class A {
    private int i;
    public int a;
    int b;
    protected int c;

    public A(int i, int a, int b, int c) {
        this.i = i;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getI() {
        return i;
    }

    protected int sd(int k){
        return k;
    }




    public static void main(String[] args) {
        A object=new A(5,4,6,7);
        System.out.println(object.a+object.b+object.c+ object.i);
    }

}
