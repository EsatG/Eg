package day50_polymorphism;

interface I{

    void method2();// public abstract
    abstract int method3();

    // public I(){} error => can not have constructor in interface

    // {  } error => can not have instance block in interface
   //  static {  } => con not have static block in interface

    int a = 1000;  // public,static,final

    public static void main(String[] args) {
        System.out.println(a);
    }


}

abstract class A{

    { }
    static { }

    public A(){ }

    public abstract void method1();
    public void method4(){

    }

}

interface I2 {

}

public  class Abstraction extends A implements I,I2{


    @Override
    public void method2() {

    }

    @Override
    public int method3() {
        return 0;
    }

    @Override
    public void method1() {

    }


    //public abstract void method1();

}
