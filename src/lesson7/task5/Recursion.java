package lesson7.task5;

public class Recursion {
     private int a;
     private int b;

   public Recursion(int a, int b){
        this.a=a;
        this.b=b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int recurs(int b){
        this.b=b;
        if(a==b){
            System.out.println(a);
            return a;
        }
       if(a<b){
            recurs(b-1);
           System.out.println(b);
       }
       else {
           recurs(b+1);
           System.out.println(b);
       }
        return b;
}
}
