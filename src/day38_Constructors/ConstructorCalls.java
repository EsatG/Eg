package day38_Constructors;

public class ConstructorCalls {

    public ConstructorCalls(){
        method1();
        method2();

    }

    public ConstructorCalls(int a){

        // ConstructorCalls(); == > compile error ; can not be called by its name
        this();   // this()  keyweord is used call a constructor
    }

    public static void method1 (){
      //  ConstructorCalls();  compile error=>>  // only a constructor can call other constructor

    }

    public void method2(){
        method1();

    }




}
