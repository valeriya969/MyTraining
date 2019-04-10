package lesson7.task4;

public class ReaderDemo {
    public static void main(String[] args) {
        Reader[] readers = new Reader[10];
        readers[0]=new Reader("Петров В. В.");
        Book book1 = new Book("Приключения");
        Book book2 = new Book("Словарь");
        Book book3 = new Book("Энциклопедия");
        readers[0].takeBook(3);
        readers[0].takeBook("Приключения","Словарь","Энциклопедия");
        readers[0].takeBook(book1,book2,book3);
        readers[0].returnBook(3);
        readers[0].returnBook("Приключения","Словарь","Энциклопедия");
        readers[0].returnBook(book1,book2,book3);


    }
}
