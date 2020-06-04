package day47_Abstraction;

abstract class A{
    public abstract void method1(); // mandatory to be overridden
    public void method2(){  // this method can not mandatory to override since it is regular method
    }


}

public class Abstract_VS_NonAbstract2 extends A {

    @Override
    public void method1(){

    }

}

abstract class B extends A{  // optional to override the abstract method of A since class B (subclass) is also abstract


}

class C extends B{

    @Override
    public void method1(){

    }
}
