package day27_DateTime;

public class Find_Minimum {

    public static void main(String[] args) {

        int[] arr = {5, 4, 7, -5};
        double [] arr2 ={ 6, 67, 4, 7/5, 0.9};

        int minNum = Minimum(arr);
        System.out.println(minNum);

        double minnum =  Minimum(arr2);
        System.out.println(minnum);
    }

    public static int Minimum (int [] arr){
        int minimum = arr[0];   // assigned as minimum

        for (int each : arr) {

            if (each < minimum) {
                minimum = each;
            }
        }
        return minimum;
    }

     public static double Minimum(double [] arr){                // overloaded method
         double minimum = arr[0];   // assigned as minimum

         for (double each : arr) {

             if (each < minimum) {
                 minimum = each;
             }
         }
         return minimum;
     }



}
