package day29_Wrapper_ArrayList;

import java.util.Arrays;

public class valueOfMethods {
    public static void main(String[] args) {

        // valueOf : convert string to wrapper class

        String str = "123";

        Integer a = Integer.valueOf(str);   // Integer 123
        System.out.println(a);

        double b = Integer.valueOf(str); // unboxing // we can assign wrapper class to any primitive as long as range is matching
        System.out.println(b);

        String str2 = "15.5";
        double d1 = Double.parseDouble(str2);  // parse method returns us as a primitive

        double d2 = Double.valueOf(str2);  // unboxing

        System.out.println(d1);
        System.out.println(d2);

        System.out.println("==========================================================");

        int z1 = 2000;
        // Long L1 = z1; // compile error // does not accept any other primitives except long

        Short sh1 = 3000;
        int i1 = sh1;

        String r1 = "True";   // any string other than "true" will ALWAYS return false
        Boolean b1 = Boolean.valueOf(r1);  // Boolean , true.. it is not case sensitive "tRuE"
        boolean t1 = Boolean.valueOf(r1);  // unboxing

        System.out.println(b1);
        System.out.println(t1);
        System.out.println("===================================================================");

        int maxNum = Integer.MAX_VALUE;
        System.out.println(maxNum);

        int minNum = Integer.MIN_VALUE;
        System.out.println(minNum);

        double maxNum2 = Double.MAX_VALUE;
        System.out.println(maxNum2);

        float minNum2 = Float.MIN_VALUE;
        System.out.println(minNum2);

        byte maxNum3 = Byte.MAX_VALUE;
        System.out.println(maxNum3);

        byte minNum3 = Byte.MIN_VALUE;
        System.out.println(minNum3);

        System.out.println("===========================================================================");

        int [] arr = new int [3];   // default value of int is zero (0)
        System.out.println(Arrays.toString(arr));

        boolean[] arr1 = new boolean[3];   /// default value of boolean is false
        System.out.println(Arrays.toString(arr1));

        Boolean [] arr2 = new Boolean[3];  // default value of Boolean class is null also all af the wrapper class values are null
        System.out.println(Arrays.toString(arr2));

        char [] arr3 = new char[3];
        System.out.println(Arrays.toString(arr3));




        /*
        default values of primitives:
              byte,short,int,long =>> 0
              boolean : false
              float,double : 0.0
              char : empty space
         */

























    }
}
