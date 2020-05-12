package day38_Constructors;

public class ConstructorCalls3 {

    public ConstructorCalls3(){
        this(5);
        System.out.println("Default");
    }

    public ConstructorCalls3(int a){

        System.out.println("Int argument");
    }

    public ConstructorCalls3(String str){
       //  this("Hello");   // compile error; A constructor can not call itself

    }

    public static void main(String[] args) {
        new ConstructorCalls3();  // this is object of class by using default constructor
    }

    public void method1(){


    }



}
