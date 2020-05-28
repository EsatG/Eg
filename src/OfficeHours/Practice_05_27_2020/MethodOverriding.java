package OfficeHours.Practice_05_27_2020;

public class MethodOverriding {
   /*
    public void method1(){

    }

    public void method1(int a){  // method overloading (method1 is overloaded)

    }

    */

    public void method1(){
        System.out.println("Super Class");
    }

}

class Test extends MethodOverriding{
//     Sub            Super

    @Override
    public void method1() {  // Access modifier of sub class MUST be more visible than Super Class' in order to overriding
        System.out.println("Sub Class");
    }

    public static void main(String[] args) {

        MethodOverriding obj = new MethodOverriding();
        obj.method1();  // Super Class

        Test obj2 = new Test();
        obj2.method1();   // Sub Class

    }
}
