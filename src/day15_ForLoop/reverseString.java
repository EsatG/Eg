package day15_ForLoop;

public class reverseString {
    public static void main(String[] args) {

        String str = "How are you doing ?";
        String reverse1 = "" + str.charAt(3) + str.charAt(2) + str.charAt(1) + str.charAt(0);

        int lastIndexNumber =str.length() - 1;

        for (int i = lastIndexNumber; i >= 0; i--){
            System.out.print(str.charAt(i)  );
        }

        /*
        write a program to identify if a string is palindrome      /level ==> level (palindrome)
        */



    }
}
