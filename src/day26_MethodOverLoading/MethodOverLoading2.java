package day26_MethodOverLoading;

import java.util.Arrays;

public class MethodOverLoading2 {
    /*
    first method: print the sum of two int  numbers
    second method: print the sum of three int numbers
    third method: print the sum of four int numbers
     */

    public static void main(String[] args) {

     sum(10,6);
     sum(3,5,87);
     sum(4,2,5,-1);

     int []   arr1 = {3, 2,1};
     char []  arr2 = {'z','s','a'};
     double[] arr3 = {7.4, 6,5, 8.9};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);

    }


    public static void sum (int a,int b){
        System.out.println(a + b);
    }

    public static void sum (int a, int b, int c){
        System.out.println( a + b + c);
    }
    public static void sum (int a, int b, int c, int d){
        System.out.println(a + b + c + d);
    }













}
