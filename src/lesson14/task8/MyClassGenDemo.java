package lesson14.task8;

public class MyClassGenDemo {
    public static void main(String[] args) {
        Integer Num[] = {5, 6, 8, 19, 56, 5, 0, 51};
        String Row[]={"d","e","o","a","z"};
        MyClassGen<Integer> myClassGen1=new MyClassGen<>(Num);
        MyClassGen<String> myClassGen2=new MyClassGen<>(Row);
        System.out.println("In Num min = "+myClassGen1.min());
        System.out.println("In Num max = "+myClassGen1.max());
        System.out.println("In Row min = "+myClassGen2.min());
        System.out.println("In Row max = "+myClassGen2.max());

    }
}
