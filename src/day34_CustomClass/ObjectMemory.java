package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ObjectMemory {

    int i = 1000; // instance variable (because it outside the block of method)

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10,20,30,40));

        ArrayList<Integer> list2 = list1;

        list1.remove(2);
        System.out.println(list1);  // 10, 20, 40

        System.out.println(list2);

        System.out.println("===================================================");

        String str1 = new String("cybertek");   // str1 = reference variable
        String str2 = str1;

        str1 = str1.toUpperCase();

        System.out.println(str1);  // CYBERTEK
        System.out.println(str2);  // cybertek

        int a = 300;   // local variable


    }



}