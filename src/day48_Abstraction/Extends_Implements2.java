package day48_Abstraction;

interface P {
   void method1();
}

 interface Q  {
   int method2();
}

abstract class R  {
   abstract void method3();
}

public class Extends_Implements2 extends R implements Q,P {  // extend and implements key words can use together, but extend keyword must use firstly

    public static void main(String[] args) {

      //   R obj = new R();error=> R is not concrete so we not create an object of it
       //  Q obj2 = new Q();error Q is not concrete so we not create an object of it

    }


    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    void method3() {

    }
}

// implements keyword is only using for class
