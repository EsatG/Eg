package day27_DateTime;

public class unique_arrays {
    /*
    3. write a method that can print out the unique elements from an int array
					Ex: {1,1,2,3,3} ==> 2
						{6,6,7,7,8,9} ==> 8 9
		4. write a method that can print out the unique elements from a double array
					Note: Apply method overloading
     */
    public static void main(String[] args) {

        int [] arr = {1,1,2,3,3,4,6};    // unique one is 2


        for (int each2 : arr){     //   for (int i = 0; i < arr.length; i++)  we can also use regular for loop

            int count = 0;
            for (int each : arr){
                if (each == each2){
                    count++;
                }
            }
            if (count == 1){
                System.out.println(each2);
            }
        }
        System.out.println("==============================================================================");
        int [] arr2 = {3,3,4,4,4,5,6,7,8,8,9};
        uniqueElements(arr2);
        System.out.println("========================================================================");
        double[] arr3 = {1.5,2.3,1.5,6.4,4.2,6.4};
        uniqueElements(arr3);





    }
    public static void uniqueElements(int[] arr){

        for (int each2 : arr){     //   for (int i = 0; i < arr.length; i++)  we can also use regular for loop
            int count = 0;
            for (int each : arr){
                if (each == each2){
                    count++;
                }
            }
            if (count == 1){
                System.out.println(each2);
            }
        }





    }

    public static void uniqueElements(double[] arr) {
        for (double each2 : arr){     //   for (int i = 0; i < arr.length; i++)  we can also use regular for loop
            int count = 0;
            for (double each : arr){
                if (each == each2){
                    count++;
                }
            }
            if (count == 1){
                System.out.println(each2);
            }
        }
    }





}
