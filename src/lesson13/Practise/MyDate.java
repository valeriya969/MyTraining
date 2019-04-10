package lesson13.Practise;

import java.time.LocalDate;

public class MyDate {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.of(1991,02,5);
        LocalDate localDate1=LocalDate.now();
        System.out.println(localDate1.isAfter(localDate));
        System.out.println(localDate1.isBefore(localDate));
        System.out.println(localDate.isLeapYear());

        localDate1.isBefore(localDate);
        localDate.isLeapYear();
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getEra());
        System.out.println(localDate.getMonth());
    }
}
