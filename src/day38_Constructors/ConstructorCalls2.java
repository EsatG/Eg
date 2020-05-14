package day38_Constructors;

public class ConstructorCalls2 {

    /*
    Calling Constructors:
    1. Only a constructor can call other constructor
    2. Constructor can not be called by its name, this()  keyword is used call a constructor
    3. Constructor call needs to be at the first step
    4. Just One Constructor can be called to a constructor
    5. A constructor can not call itself
    6. A constructor can not contain itself.
     */

    public ConstructorCalls2(){

        System.out.println("Default Constructor");
    }

    public ConstructorCalls2(int a){
        this(); // calling default constructor
        System.out.println("Constructor with int argument");


    }

    public ConstructorCalls2(String str){
            this(1);   // calling constructor with int argument
        System.out.println("Constructor with String argument");

    }

    public static void main(String[] args) {
        ConstructorCalls2 obj = new ConstructorCalls2("Hi");


    }








}
