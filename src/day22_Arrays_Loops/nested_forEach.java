package day22_Arrays_Loops;

import java.util.Arrays;

public class nested_forEach {
    public static void main(String[] args) {

    int [][] arr2D = { {1,2,3}, {4,5,6}};

    for (int [] each1Darray: arr2D){


        for(int eachElement : each1Darray){
            System.out.println(eachElement);
        }
    }
        System.out.println("======================================================================");

    char [][] ch2D = { {'A','B'}, {'C', 'D', 'E'}  };

    for(char [] each1Darray : ch2D){
      //   System.out.println(Arrays.toString(each1Darray));
        for (char eachvalue : each1Darray){
            System.out.print(eachvalue +" ");
        }

    }



    }
}
