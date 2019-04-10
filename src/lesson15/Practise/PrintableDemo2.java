package lesson15.Practise;

import lesson9.Practise.Printable;

public class PrintableDemo2 {
    public static void main(String[] args) {
        Printable newspaper = () -> System.out.println("Print newspaper");
        Printable magazine = () -> System.out.println("Print magazine");
        Printable[] printables = {newspaper, magazine};
        for (Printable printable : printables) {
            printable.print();
        }
    }
}
