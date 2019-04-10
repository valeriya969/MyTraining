package lesson5.task9;

public class Factorial {
    public static void main(String[] args) {
        int n = 1 + (int)(Math.random()*20);
        int res = 1;
        for (int i = 1; i<=n; i++ ){
            res = res*i;
        }
        System.out.println(n+"!="+res);
    }
}
