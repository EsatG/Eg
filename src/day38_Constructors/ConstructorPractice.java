package day38_Constructors;

public class ConstructorPractice {

    public ConstructorPractice(){
        this(10.0);
        System.out.println("A");
    }

    public ConstructorPractice(int a){
        this();
       //  this(10.5);  compile error =>> rule #4
        System.out.println("B");
    }

    public ConstructorPractice(double a){
        // this();=>>  compile error  rule #6
        // this(5.5);==> compile error   rule #5
        // this(10);  compile error =>> rule #6
        System.out.println("C");
    }


    public static void main(String[] args) {

        new  ConstructorPractice(10);
    }









}
