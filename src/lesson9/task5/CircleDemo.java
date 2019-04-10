package lesson9.task5;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle1=new Circle(34);
        Circle circle2=new Circle(4);
        Circle circle3=new Circle(5);
        Circle circle4=new Circle(10);
        Circle[] circles={circle1,circle2,circle3,circle4};
        for (Circle circle:circles) {
            circle.calculateLength();
            circle.calculateAreaOfCircle();
        }
    }
}
