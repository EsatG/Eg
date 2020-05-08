package day36_StaticBlock;

public class StaticBlock {



    public static void main(String[] args) {
        System.out.println("Main Method executed");
        method1();
    }


    static {     // static block is executed first by compiler
        System.out.println("Static block executed");
    }

    public static void method1(){
        System.out.println("Custom Method executed");
    }





}
