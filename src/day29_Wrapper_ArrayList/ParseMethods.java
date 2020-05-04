package day29_Wrapper_ArrayList;

public class ParseMethods {
    public static void main(String[] args) {

        String str = "123";
        // parse methods: converts string of text to the primitives

        int a1 = Integer.parseInt(str);    // convert string to int

        System.out.println(str);  // text
        System.out.println(a1);   // number

        byte b1 = Byte.parseByte(str);  // byte = 123
        System.out.println(b1);
        System.out.println(b1 + 3);

        Integer I1  = (int) Byte.parseByte(str);  // Autoboxing

        String str2 = "10.5";
        float f1 = Float.parseFloat(str2);
        System.out.println(f1 + 1); // we can see it is a number with add a number


        double d1 = Double.parseDouble(str2);   // double 10.5
        System.out.println(d1);

        String str3 = "3147483647";

        long l1 =  Long.parseLong(str3);
        System.out.println(l1 + 2);

        Long L1 = Long.parseLong(str3);    // Autoboxing
        System.out.println(L1 + 2);

        String result1 = "true";
        boolean h1 = Boolean.parseBoolean(result1);
        System.out.println( h1);    // true
        System.out.println( ! h1);   // false

        String result2 = "Today is monday"; // besides "true",  it always returns false whatever you give as a text
        boolean h2 = Boolean.parseBoolean(result2);
        System.out.println(h2);

        String result3 = "tRUe";    // parse method is not case sensitive
        boolean h3 = Boolean.parseBoolean(result3);
        System.out.println( h3);    // true
        System.out.println( ! h3);   // false













    }
}
