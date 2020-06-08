package day48_Abstraction;

public interface Interface2 {

    // public Interface2(){ } error=> we can not have constructor in interface

   //  public void method1(){ } error=> we can not have instance method in interface



    int a = 10;  // static & final variable by default

    public static void main(String[] args) {
        System.out.println(a);
        // a = 5; error=> we can not reassign to a final variable

        System.out.println(Interface2.a);
        Interface2.method4();
    }

    public static void method4(){ }

    void method5();

    default void method6(){  // only using allowing to interface for lambda expressions
        System.out.println("Default method");
    }

}
