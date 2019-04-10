package lesson3.task1;

import java.io.IOException;
import java.util.Scanner;

public class Even {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число");
        if ( sc.hasNextInt()){
            int a = sc.nextInt();
            if (a % 2 == 0) {
                System.out.println("Вы ввели четное число");
            } else {
                System.out.println("Вы ввели нечетное число");
            }
            }
            else {
            System.out.println("Вы ввели нецелое число");
        }

    }


}
