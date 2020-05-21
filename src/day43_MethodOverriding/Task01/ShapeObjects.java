package day43_MethodOverriding.Task01;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle1 = new Circle(3);

        System.out.println(circle1.radius);

        circle1.calculateArea();
        circle1.calculatePerimeter();

        System.out.println("====================================================================");

        Rectangle rec1 = new Rectangle(2,2.5);

        System.out.println(rec1.length);
        System.out.println(rec1.width);

        rec1.calculateArea();
        rec1.calculatePerimeter();

        System.out.println("==========================================================================");

        Square square1 = new Square(4);

        System.out.println(square1.side);

        square1.calculateArea();
        square1.calculatePerimeter();
    }
}
