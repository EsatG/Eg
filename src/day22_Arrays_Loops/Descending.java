package day22_Arrays_Loops;

import java.util.Arrays;

public class Descending {
    public static void main(String[] args) {

       int [] arr = {10, 78, 2, -1, 500, 70};
        Arrays.sort(arr);      //  sorts in ascending

        System.out.println(Arrays.toString(arr));

        int [] RevArr = new int [arr.length];

        int j = 0;
        for ( int i = arr.length - 1; i >= 0; i--){

            RevArr[i] = arr [j];
            j ++;

        }
        System.out.println(Arrays.toString(RevArr));








    }
}
