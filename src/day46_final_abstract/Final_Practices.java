package day46_final_abstract;

public class Final_Practices {

    final int a = 10;
    final static int b = 20;

    {
        System.out.println(a);
        // a = 20; error =>final variable can not be reassigned
    }

    static {
        System.out.println(b);
        // b = 30;  error =>final variable can not be reassigned
    }
    /*
    public final Final_Practices(){

   // constructor can not apply to final keyword since final is a return type and constructor doesn't have a return type
    }

     */

    final void method1(){

    }

    public final static void method2(){

    }

    private final int method1(int a){ // overloaded method of final method(method1)
      return 10;
    }

}

class Test1 extends Final_Practices{
  /*
    @Override
    protected void method1(){  error=> final method can not be overridden

    }

   */


}
