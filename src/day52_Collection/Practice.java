package day52_Collection;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Practice {

    /*
    1. Write a prog that can remove the duplicated characters from a String and store them into variable
    2. Write a prog that can identify if two strings are built out of the same letters

            ex: String str = "abababa"
            str2 = "ab"
            otutput = true
     */

    public static void main(String[] args) {

        // 1. Task
/*
        String str = "ABABABCDEF";    // ["A","B","C","D","E","F"]
        String [] arr = str.split("");  // returns us as a String array

        LinkedHashSet<String> ls = new LinkedHashSet<>(Arrays.asList(arr));

        System.out.println(ls);

       String result = "";
       for ( String each : ls ){
           result += each;
       }

        System.out.println(result);

 */
        // Another solution:

        String str = "ABABABCDEF";
        String [] arr = str.split("");

        str = "";

      for  (String each: new LinkedHashSet<>(Arrays.asList(arr))   ){
          str += each;
      }

        System.out.println(str);

        System.out.println("========================================================================");

        // 2. Task
        // first solution
/*
        String str1 = "abababab";
        String str2 = "baba";

       String [] arr1 = str1.split("");
       String [] arr2 = str2.split("");

      TreeSet<String> t1 =  new TreeSet<>(Arrays.asList(arr1));
       TreeSet<String> t2 = new TreeSet<>(Arrays.asList(arr2));

        System.out.println(t1);

        str1 = t1.toString();
        str2 = t2.toString();

        System.out.println(str1.equals(str2));

 */
        // second solution

        String str1 = "abababab";
        String str2 = "baba";

        str1 =  new TreeSet<>(Arrays.asList(str1.split(""))).toString();
        str2 =  new TreeSet<>(Arrays.asList(str2.split(""))).toString();

        System.out.println(str1.equals(str2));


    }
}
