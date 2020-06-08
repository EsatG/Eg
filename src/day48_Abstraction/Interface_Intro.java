package day48_Abstraction;

public interface Interface_Intro {
    /*
    Interface:
        blueprint of class. specifies the behaviours a should implement
        used for achiving abstraction
        syntax of interface=>> public interface interfaceName{  }
        pure abstraction
        they only have "public" access modifier in Interface. it is default.we can not give another access modifier
        can be super type to a class
        in order to inherit interface we must use "implements" key word

    Why do we need interface ? :
        A class can inherit from one class only (extends)
        A class can inherit multiple interfaces (implements)

    What can we have in interface ? :
        variable: static & final
        methods: abstract method, static method, default method

    What can we have in interface ? :
        constructor
        instance variable
        instance methods
        instance blocks
        static blocks


     */

    public abstract void method1();
    public int method2(); // abstract by default
    void method3();  // public access modifier is given by default



}
