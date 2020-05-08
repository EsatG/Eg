package day36_StaticBlock;

import day34_CustomClass.Tester;

public class StaticBlock4 {

    static String name;
    static Tester tester1 = new Tester();

    int insVariable;

    static {  // designed for statics only
        // gets executed as soon as the class is loaded
        // designed to initialize static variables

        name = "Cybertek School";
        tester1.setTesterInfo("Esat",123,"SDET",110000);

        StaticBlock4 obj1 = new StaticBlock4();
        obj1.insVariable = 300;   // only way we can call an instance variable to static block by creating an object
    }                             // DO NOT use static block for initializing instance variables

    public static void main(String[] args) {
        System.out.println(name);

        System.out.println(tester1);

        StaticBlock4 obj2 = new StaticBlock4();
        System.out.println(obj2.insVariable);  // 0
    }
}
