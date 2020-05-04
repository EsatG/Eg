package Repl.it;

import java.util.ArrayList;
import java.util.Arrays;

public class combineArrays {
    public static String combineRs(String[] r1,String[] r2){

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <r1.length; i++){
            list.add(r1[i]);
        }
        for (int i = 0;i < r2.length; i++){
            list.add(r2[i]);
        }
        String result ="";
        for (String each : list){
            result += each;

        }

     return result;
    }
    public static void main(String[] args){

        String [] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list = new ArrayList<>();

        System.out.println(combineRs(arr1,arr2));







    }
}
