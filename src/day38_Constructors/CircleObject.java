package day38_Constructors;

import java.text.DecimalFormat;

public class CircleObject {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");

        double r = 5.5;

        Circle circle1 = new Circle(r);

        double areaOfCircle = circle1.area();
        System.out.println("Area of circle is : " + df.format(areaOfCircle));
        System.out.println(circle1);

    }
}
