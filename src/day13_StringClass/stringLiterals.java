package day13_StringClass;

public class stringLiterals {
    public static void main(String[] args) {

        String str1 = "Cat";  // String pool
        String str2 = new String("Cat"); // java heap


        System.out.println(str1 + " : " + str2 );
        System.out.println(str1 == str2);  // two different object, false

        String str3 = "Cat"; // String Pool
        String str4 = new String("Cat");

        System.out.println(str1 == str3);
        System.out.println(str2 == str4);

        String s = "Java"; // String Pool, immutable we can not modify it
        s = "JavaScript";   // new object will be created
        System.out.println(s);  // JavaScript

        String s1 = "Java";   // no new object will be created in the memory

        System.out.println(s == s1);   // False      "JavaScript" != "Java"






    }


}

