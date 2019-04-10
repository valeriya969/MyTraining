package lesson5.task2;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число");
        if (scan.hasNextInt()){
            int a = scan.nextInt();
            if (a>=0&a<=10){
                System.out.println("Положительное число меньше или равно 10");
            } else {
                System.out.println("Положительное число больше 10 или отрицательное");
            }
        } else {
            System.out.println("Введите целое число");
        }

    }

}