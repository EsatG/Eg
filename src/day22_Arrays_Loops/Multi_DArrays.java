package day22_Arrays_Loops;

import java.util.Arrays;

public class Multi_DArrays {
    public static void main(String[] args) {

        int [] arr = {1,2,3};

        int [][] arr2D = { {1,2,3}, {4,5,6}  };

        int [] arr1D = arr2D[0];  // {1,2,3}


        System.out.println(Arrays.toString(arr1D));       // [1,2,3]
        System.out.println(Arrays.toString(arr2D[0]));    // [1,2,3]

        System.out.println(arr2D [0][2]);    //  3

        System.out.println(Arrays.deepToString(arr2D));












    }
}
