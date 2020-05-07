package day35_Static;

public class staticMethods {

    int a = 100;
    static int b = 200;

    public static void main(String[] args) {

        // System.out.println(a); compile error.a is not accepted Because static only accepts static, not instances

        staticMethods obj = new staticMethods();

        System.out.println(obj.a);
        System.out.println("=========================================");

        System.out.println(b);  // b is accepted because it is static
        System.out.println(staticMethods.b);
        System.out.println(obj.b);   // prefers to be called through the class name



    }

    public void method(){   // instance methods belong to the object
        System.out.println(a);  // it does not give us compile error because it is instance also
        System.out.println(b);  // you can call static variable to anywhere of class

    }
}
