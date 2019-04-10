package lesson9.Practise;

public class ShapeDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle("red", 3, 4, 15);
        Circle circle2 = new Circle("pink", 3, 5, 15);
        Shape[] shapes = {circle1, circle2};
        for (Shape shape:shapes) {
            shape.draw();
        }
        System.out.println(circle1.equals(circle2));
        System.out.println(circle1);
        System.out.println(circle2);

    }
}
