package day29_Wrapper_ArrayList;

public class WrapperClass {
    public static void main(String[] args) {

        int a = 100;    // primitive

        Integer b = a;    //wrapper class     // every class presented in "java.lang" package

        short s1 = 200;
        int n1 = s1;

        //  Integer N1 = s1; =>> it gives us compile error since Integer is dedicated to int primitive
        Integer n2 = n1;

        // ===============================================================================

        int a1 = 20;
        float f1 = a1;

       //  Float f2 = a1; =>> it gives us compile error since Float is dedicated to float primitive

        Integer I1 = 200;
        int a2 = I1;

        Byte B1 = 126;
        int a3 = B1;   // not gives us compile error since primitives do not dedicated their wrapper class
        System.out.println(a3);


    }


}
