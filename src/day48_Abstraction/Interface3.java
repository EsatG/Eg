package day48_Abstraction;

public interface Interface3 {

    public void method1();
    public abstract void method2();

    static final int num = 10;
    int num2 = 20; // also static and final by default

    public static void main(String[] args) {
        Interface3.method3();
        System.out.println(num2);


    }

    static void method3(){ // static method can not be abstract, so it must have body/implementation

    }



}
