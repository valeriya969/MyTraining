package lesson16.task9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Student {
    private String name, group;
    private int course;
    private double mark;

    public Student(String name, String group, int course, double mark) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public double getMark() {
        return mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.mark, mark) == 0 &&
                Objects.equals(name, student.name) &&
                Objects.equals(group, student.group) &&
                Objects.equals(course, student.course);
    }

    public static List<Student> transferStudent(List<Student> list){
        List<Student> result = new ArrayList<>();
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student student =iterator.next();
            if (student.getMark() < 3) {
                iterator.remove();
                result.add(student);
            } else {
                student.course++;
                result.add(student);
            } 
        }
        return result;
    }

    public static void printStudent(List<Student> list, int course){
        for (Student student : list) {
            if (student.getCourse()==course)
                System.out.println(student.getName());
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, group, course, mark);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course='" + course + '\'' +
                ", mark=" + mark +
                '}';
    }
}
