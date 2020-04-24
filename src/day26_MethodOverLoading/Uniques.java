package day26_MethodOverLoading;

public class Uniques {
    /*
    use the above method to create another called uniques that accepts a string paramter and returns it's unique characters as String
			Ex: uniques("ABBC"); 		==> "AC"
				uniques("Cybertek");  	==> "cybrtk"
     */

    public static void main(String[] args) {

        String str = "ABBCDB";
        String result = "";  // unique character is A

        for ( int i = 0; i < str.length(); i++){
            int num = Frequency(str, str.charAt(i));
            if (num == 1) {
                result += str.charAt(i);
            }
        }
        System.out.println(result);

        String str2 = "Cybertek";
        String result2 =Uniques(str2);
        System.out.println(result2);


    }

    public static String Uniques(String str){
        String result = "";  // unique character is A

        for ( int i = 0; i < str.length(); i++){
            int num = Frequency(str, str.charAt(i));
            if (num == 1) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static int Frequency(String str, char ch){
        char [] arr = str.toCharArray();     //    [A, A, A ]

        int count = 0;
        for (char each : arr ){    // it will get executed 3 times
            if ( each == ch){
                count++;
            }

        }

        return count;
    }





}
