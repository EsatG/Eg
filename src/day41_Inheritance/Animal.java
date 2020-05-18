package day41_Inheritance;

public class Animal {

    /*
    Inheritance:
           visible methods and variables can be inherited.
           easist way to get rich
           build relationship between classes
           super (parent) & sub (child) relationship
           advantage: improves re-usability; easy to maintain

           sub class: can inherit variables and methods from super class
           super class: can not inherit anything
           "is a" relation : inherited relationships between classes
           "Has A" relation : one class's object is used by another class without inheritance
     */

    public String name;
    public String size;
    public double weight;

    public void eat(){
        System.out.println(name + " is eating");
    }

    public void move(){
        System.out.println(name + " is moving");
    }




}
