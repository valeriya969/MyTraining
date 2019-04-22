package lessson16.task9;

import java.util.ArrayList;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("John","S",2,2.5));
        list.add(new Student("Adam","S",3,3.2));
        list.add(new Student("Adam","E",1,5));
        list.add(new Student("Paul","E",2,4));
        list.add(new Student("Eva","E",2,4));
        list.add(new Student("Emilia","S",4,3.5));
        list.add(new Student("Ann","E",4,2.7));
        List<Student> nextList = Student.transferStudent(list);
        System.out.println(nextList);
        System.out.println(list);
        Student.printStudent(list,4);
        Student.printStudent(list,3);
    }
}
