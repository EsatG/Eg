package day43_MethodOverriding.Task01;

public class Shape {

    public double area;
    public double perimeter;

    public void calculateArea(){
        System.out.println("Area of the shape: " + area);
    }

    public void calculatePerimeter(){
        System.out.println("Perimeter of the shape: " + perimeter);
    }
}
