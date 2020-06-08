package day48_Abstraction;

interface I1 {
    void method1();

}

interface I2 extends I1 {  // 2 abstract methods
    void method2();

}

abstract class AC implements I2 {  // 3 abstract methods
    abstract void method3();

}


public abstract class Extends_Implements extends AC{ // 3 abstract methods

    @Override
    public void method3(){

    }
    // 2 abstract method left : method1 & method2

}

class TestRun extends Extends_Implements {

    @Override
    public void method1(){

    }

    @Override
    public void method2(){

    }


}
