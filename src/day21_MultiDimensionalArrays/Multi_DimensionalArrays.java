package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class Multi_DimensionalArrays {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4};   // regular array: stores values/data

        // index number     0 1 2 3    0 1 2 3 4
        int [][] arr2D = { {1,2,3,4}, {5,6,7,8,9} };  // each single dimensional arrays are index of the 2D array
             // index number    0        1

        System.out.println(arr2D.length);

       int [] arr1D = arr2D[0];   // {1,2,3,4}

        System.out.println(Arrays.toString(arr2D[0]));

        int num = arr2D[1] [3];   // 8
        System.out.println(num);

        char [][] ch2D = {  {'A', 'B'}, {'D', 'E', 'F'}, {'G', 'H', 'I'} };  // must contain single dimensional char array

        char ch = ch2D [1] [0];   // 'D'
        System.out.println(ch);

        char [] ch2 = ch2D[2];   // {G, H, I}

        System.out.println(Arrays.toString(ch2));

        String [][] str2D = { { "A", "B", "c"}, {"D", "E", "F"}, {"J", "H", "I"}   };

        String r1 =str2D [2] [1];
        System.out.println(r1);









    }
}
