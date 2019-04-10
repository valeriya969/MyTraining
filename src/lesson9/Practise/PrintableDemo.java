package lesson9.Practise;

public class PrintableDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Wind");
        Book book2 = new Book("Smile");
        Magazine magazine1 = new Magazine("Elle");
        Magazine magazine2 = new Magazine("Vogue");
        Printable[] printables={book1,magazine1,magazine2,book2};
        for (Printable printable:printables) {
            printable.print();
        }
        Magazine.printMagazines(printables);
        Book.printBooks(printables);
    }
}
