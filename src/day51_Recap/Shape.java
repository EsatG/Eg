package day51_Recap;

public abstract class Shape {

    /*
    variables: name(static)
            abstract methods: calculateArea(), calculatePerimeter();
                    both methods return double
     */

    public String name;

    public abstract double calculateArea();

    public abstract double calculatePerimeter();




}

interface Volume {
    /*
     variable: boolean hasVolume
            abstract method: calculateVolume() ==> returns double

     */

    boolean hasVolume = true;

    double calculateVolume();

}

interface PI {
    /*
     variable: PI
               */

    double PI = 3.14;

}
