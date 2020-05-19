package day42_Inheritance;

class Test{

    public Test(){
        System.out.println("A");
    }


}

public class Constructor extends Test {

    public Constructor(){
        System.out.println("B");
    }

    public static void main(String[] args) {

       //  Test obj = new Test(); // A
        Constructor obj = new Constructor();// AB
        //  at least one super class' constructor must be called into sub class
        // if super class' constructor is not default it must be called manually into sub class by using "super()" keyword
    }


}
