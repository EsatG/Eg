package MyStudies;

public class MaxAndMinNumber {

    /*
    4. creata a function that can print the maximum number from any given array
	5. creata a function that can print the minimum number from any given array
     */
    public static void main(String[] args) {
        int[] arr = {2, 3, -1, 4, 0};

        Max_MinNumber(arr);

    }

     public static void Max_MinNumber (int [] arr ) {
         int min = arr [0];
         int max = arr [0];
         for (int each: arr){

             if ( each > max){
                 max = each;

             }
             if (each < min){
                 min = each;
             }


         }
         System.out.print("Maximim number is " +max );
         System.out.println();
         System.out.print("Minimum number is " +min );

     }







}
