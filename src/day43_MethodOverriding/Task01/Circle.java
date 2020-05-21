package day43_MethodOverriding.Task01;

public class Circle extends Shape{

    public double radius;
    public static double PI = 3.14;

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public void calculateArea(){
        area = radius * radius * PI;
        System.out.println("Area of the circle : " + area);
    }

    public void calculatePerimeter(){
        perimeter = 2 * radius * PI;
        System.out.println("Perimeter of the circle: " + perimeter);
    }


}
