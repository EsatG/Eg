package day51_Recap;

public final class Circle extends Shape implements PI {
    /*
    create a final class named circle that can inherit from Shape and PI
                variable: radius
                set a static block that initialize the name to "Circle"
                set a constructor that can initialize the radius

     */

    public double radius;


    public Circle(double radius){
        this.radius = radius;
        name = "Circle";
    }



    @Override
    public double calculateArea() {
        return radius*radius*PI;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * radius * PI;
    }


}
