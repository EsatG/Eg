package day51_Recap;

import java.util.ArrayList;
import java.util.Arrays;

public class ShapesObjects {
    /*
    1. create two circle and two Cylinder' objects
                2. create an ArrayList that can contain  all those objects

     */

    public static void main(String[] args)  {

        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(2.5);

        Cylinder cylinder1 = new Cylinder(3,4);
        Cylinder cylinder2 = new Cylinder(2,3.5);

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.addAll(Arrays.asList(circle1,circle2,cylinder1,cylinder2));

        for (Shape eachShape : shapes){
            System.out.println(eachShape.name + " : " + eachShape.calculateArea());
        }

        System.out.println("=============================================================");

       // shapes.get(2).calculateVolume(); error=>> reference type is shape, shape does not have "calculateVolume()" method

        double d = ((Cylinder)shapes.get(2)).calculateVolume();
        System.out.println(d);

       // ((Cylinder)shapes.get(1)).calculateVolume(); // gives exception, because circle can not be referenced by cylinder since they have no "is a" relation

        Shape s1 = new Circle(5);
        // s1.radius; error => Shape class has no "radius"

        Circle c1 = (Circle)s1;

        System.out.println(c1.radius);  //  ((Circle) s1).radius






/*
        Shape shape1 = circle1; // upcasting  (implicitly done)

        cylinder1 = (Cylinder)shape1;  // down casting (done by manually)

 */




    }


}
