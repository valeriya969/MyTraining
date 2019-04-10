package lesson3.task2;

import java.util.Scanner;

public class Plus {
    public static void main(String[] args) {
        int a,b;
        Scanner number = new Scanner(System.in);
        System.out.println("Введите два числа");
        if (number.hasNextInt()){
            a=number.nextInt();
            b=number.nextInt();
            System.out.println("Сумма равна "+(a+b));
        }
        else {
            System.out.println("Введите целое число");
        }
    }
}
