package day21_MultiDimensionalArrays;

public class Longest_Shortest_Words {
    public static void main(String[] args) {

        /*
        2. write a program that can return the logest string of text from an array
	    3. write a program that can return the shortest string of text from an array
         */

        String [] names = {"Reem", "Omer", "Muhtar", "Emrah", "Muhammed", "Ana"};

        int maxLengthString = names [0].length();
        int minLengthString = names[0].length();

        String longestWord = "";
        String shortestWord = "";

        for (int i =0; i <= names.length-1; i++){

            if ( names[i].length() > maxLengthString){

                maxLengthString = names[i].length();
                longestWord = names[i];

            }
            if(names[i].length() < minLengthString){
                minLengthString = names[i].length();
                shortestWord = names[i];
            }
        }
        System.out.println("Longest word is: " + longestWord);
        System.out.println("Shortest Word is: " + shortestWord);





    }
}
