package OfficeHours.Practice_05_27_2020;

public class MethodOverriding2 {

    protected void method1(){

    }

    public static void method2(){

    }


}

class TestClass extends MethodOverriding2{

    protected void method1(){

    }
    // @Override    =>> error
    public static void method2(){  // static method can NOT be overridden only instance method can be overridden

    }
}
