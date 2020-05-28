package OfficeHours.Practice_05_27_2020;

public class MethodOverloading {

    public void method(){

    }

    public void method(int a){  // it doesn't matter about visibility of access modifiers in order to method overloading

    }

    public static void method2(){

    }

    public static int method2(int a){   // it doesn't matter what return type is.
        return 123;
    }
    public MethodOverloading(){

    }

    public MethodOverloading(int a){  // constructor can be overloaded

    }

    public MethodOverloading(int a, int b){

    }

    public MethodOverloading(String str){

    }

    public static void main(String[] args) {
        System.out.println("String");

    }

    public static void main(String str) {  // main method also can be overloaded

    }

    public static void main(int a) {
        System.out.println("Integer");
    }







}
