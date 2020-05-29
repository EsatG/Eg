package day43_MethodOverriding;

class Test {

  protected void method(){

        System.out.println("Esat");
    }
}

public class MethodOverriding extends Test {
    /*
   method overriding: same method name, same parameter, same return type
                      access modifier must be either same or more visible;  access modifier can not be private
                      it must take place in the sub class
                      @Override: identifies if the method is overriding or not
                      it is used in order to implement different functions to the same method
                      "Static" can not be overridden, only the instance methods can be overridden
    */

    @Override  // identifies if the method is overriding or not
    public  void method(){   // =>> method overriding

        System.out.println("Cevdet");
    }

    public static void main(String[] args) {

        Test obj1 = new Test();
       obj1.method();  // Esat

        MethodOverriding obj2 = new MethodOverriding();
        obj2.method();  // Cevdet
    }





}
