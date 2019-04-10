package lesson12.Practise;

import java.util.Formatter;

public class Formate {
    public static void main(String[] args) {
        formatString("Button",5,"Math");
    }

    private static void formatString(String fullname, int mark, String subject){
        Formatter formatter = new Formatter();
        formatter.format("Student %15s got %3s in %10s",fullname,mark,subject);
        System.out.println(formatter);
    }
}
