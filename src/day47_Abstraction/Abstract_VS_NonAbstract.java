package day47_Abstraction;

class Test1{

    public Test1(){}  // constructor
    public void method1(){}  // instance method
    public static void method2(){}  // static method
    // public abstract void method3(); error=> can not have abstract method in a regular(nonabstract) class

    int a = 100;  // instance variable
    static int b = 200;  // static variable

    {    // instance block

    }
    static {   // static block

    }

}

abstract class Test2{

    public Test2(){} // constructor
    public void method1(){}  // instance method
    public static void method2(){} // static method
    public abstract void method3();

    int a = 100; // instance variable
    static int b = 200;  // static variable

    { // instance block

    }

    static {  // static block

    }

}

public class Abstract_VS_NonAbstract {

}

