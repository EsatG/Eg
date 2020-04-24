package day21_MultiDimensionalArrays;

public class ForEachLoop {
    public static void main(String[] args) {

        int [] nums = {1, 2, 3, 4};

        for (int eachElement : nums){
            System.out.println(eachElement);
        }

        String [] students = {"Muhtar", "Asiya", "Murodil"};

        for (String eachStudent : students){
            System.out.println(eachStudent);
        }

        int [] arr1 = {1,2,3,4,5,6,7,8,9,10};

        for (int each: arr1){

            if ( each < 5 ){
                continue;
            }
            System.out.println(each);
        }
        System.out.println("=====================================================================");

        String sentence = "I like Java";    // result ==> Java like I

       String [] words = sentence.split(" ");    // [ I, like, Java]

        for ( int i = words.length-1; i >= 0; i--){
            System.out.print(words[i] + " ");
        }







    }
}
