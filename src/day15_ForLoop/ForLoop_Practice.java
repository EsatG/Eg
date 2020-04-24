package day15_ForLoop;

public class ForLoop_Practice {

    public static void main(String[] args) {

        /*
        I want you to print odd number 1 ~ 100 in a single line seperated by a space
         */

        String resultOdd ="";

        for ( int num = 1; num <= 100 ; num += 2){
          //  System.out.print(num +" ");
            resultOdd += num + " ";

        }
        System.out.println(resultOdd);

        String resultEven = "";
        for (int number = 2; number <= 100; number += 2){
            resultEven += number + " ";
        }
        System.out.println(resultEven);








    }
}
