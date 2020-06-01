package day46_final_abstract;

public class Square extends Shape{

    public double side;

    public Square(double side){
        this.side = side;
    }

    public void area(){

        double area = side * side;
        System.out.println("Area of square is: " + area);
    }






}
