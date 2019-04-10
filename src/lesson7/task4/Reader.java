package lesson7.task4;

public class Reader {
    private String name;
    private int number_reader;
    private String department;
    private int birthday_date;
    private String phone_number;

  Reader(String name, int number_reader, String department, int birthday_date, String phone_number){
      this.name=name;
      this.number_reader=number_reader;
      this.department=department;
      this.birthday_date=birthday_date;
      this.phone_number=phone_number;
  }
  Reader(String name){
      this.name=name;
  }

    void takeBook(int n){
      System.out.println(name + " взял "+ n + " книги");
    }

    void takeBook(String...s){
        System.out.print(name+" взял книги:");
        for (String i:s) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    void takeBook(Book...b){
        System.out.print(name+" взял книги:");
        for (Book a:b){
            System.out.print(a.name+" ");
        }
        System.out.println();
    }
    void returnBook(int n){
        System.out.println(name + " вернул "+ n + " книги");
    }

    void returnBook(String...s){
        System.out.print(name+" вернул книги:");
        for (String i:s) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    void returnBook(Book...b){
        System.out.print(name+" вернул книги:");
        for (Book a:b){
            System.out.print(a.name+" ");
        }
        System.out.println();
    }



}
