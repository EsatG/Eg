package day25_MethodsRecap;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "ABAB";   // after remove the duplicates ==> AB

        String str2 = "ABCABCABC";

         String result = RemoveDuplicates(str);

        System.out.println(result);





    }

    public static String RemoveDuplicates (String str){
        String result = "";

        for ( int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(!result.contains("" + ch)) {
                result += ch;

            }
        }

        return result;
    }
}
