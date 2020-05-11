package day37_Constructors;

public class ConstructorIntro {

    public  ConstructorIntro(int a){   // constructor method, constructor name MUST be same with class name
        System.out.println("Constructor with argument of int");  // execution always depend on object
    }

    public static void main(String[] args) {

      //  ConstructorIntro obj = new ConstructorIntro(); //compile error =>> object must be created with existing constructor

        ConstructorIntro obj2 = new ConstructorIntro(10);
        ConstructorIntro obj3 = new ConstructorIntro(10);  // constructor get executed depend on how many object we created

    }















}
