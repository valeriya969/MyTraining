package lesson9.task5;

public class Circle {
    private double radius;
    final static double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void calculateLength(){
        System.out.println("Length of circle " + 2 * PI * radius);
    }

    public void calculateAreaOfCircle(){
        System.out.println("Area of circle " + PI * radius * radius);
    }
}
