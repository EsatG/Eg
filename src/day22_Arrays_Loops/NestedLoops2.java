package day22_Arrays_Loops;

public class NestedLoops2 {
    public static void main(String[] args) {

        int [][] numbers = {  {9,8,7},  {6},  {5,4,3,2,1,0}};

        /*
             numbers [0] ==> {9,8,7}           numbers[0][i] i needs to be repeated three times
             numbers [1] ==> {6}               numbers[1][i] i needs to be repeated one time
             numbers [2] ==> {5,4,3,2,1,0}     numbers[2][i] i needs to be repeated six times
         */


        for ( int j = 0; j < numbers.length; j++){

            for ( int i = 0; i < numbers[j].length; i++){
                System.out.print(numbers[j][i] + " ");
            }

        }
        System.out.println();

        // 7 8 9 6 0 1 2 3 4 5

        for (int j = 0; j < numbers.length; j++){

            for ( int i = numbers[j].length - 1; i >= 0; i--){

                System.out.print(numbers[j][i] + " ");


            }
        }
        System.out.println();
          // 5 4 3 2 1 0 6 9 8 7

        for (int j = numbers.length - 1; j >= 0; j--){    // reversed

            for (int i = 0; i < numbers[j].length; i++){
                System.out.print(numbers[j][i] + " ");
            }

        }
        System.out.println();

        // 0 1 2 3 4 5 6 7 8 9

        for (int j = numbers.length - 1; j >= 0; j--){

            for (int i = numbers[j].length - 1; i >= 0; i--){    // reversed
                System.out.print(numbers[j][i] + " ");

            }
        }













    }
}
