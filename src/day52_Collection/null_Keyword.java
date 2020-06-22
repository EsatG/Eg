package day52_Collection;

import java.util.ArrayList;

public class null_Keyword {

    static String str; // deafult value is "null", there is no object of String

    static String str2 = "Cybertek";
    static String str3 = new String("Esat");
    String str4 = null;
    Integer i1 = null; // null is only default value is non-primitive


    static ArrayList<Integer> list1 ;  // list1.get(0); =>NullPointerException

    public static void main(String[] args) {

        System.out.println(str2.charAt(0));
        System.out.println(str3.charAt(2));

       //  System.out.println(str.charAt(0)); // NullPointerException

        ArrayList<String> list2 = new ArrayList<>();
        list2.add(null);

        System.out.println(list2);

        System.out.println("=====================================================================");

        String number = null;

       //  int num1 = Integer.parseInt(number);

        // System.out.println(num1);  // NumberFormatException

        String [] arr = {null, "Esat", null};

       //  arr[2].toUpperCase(); // NullPointerexception
        arr[1].toUpperCase();

        String name1= "cybertek".toUpperCase();

        System.out.println(name1);

        System.out.println(arr.length); // 3




    }
}
