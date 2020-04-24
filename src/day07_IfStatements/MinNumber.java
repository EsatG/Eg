package day07_IfStatements;

public class MinNumber {
    public static void main(String[] args) {

        /* write a java program that accepts three numbers and return the minimum number
				(assume that none of them are equal)  */

        double a = 37.8;
        double b = 49.6;
        double c = 75;
        if (a < b && a < c){
            System.out.println(a + " is the min number");
        }
        if (b < a && b < c){
            System.out.println(b+ " is the min number");
        }
        if (c < a && c < b) {
            System.out.println(c+ " is the min number");
        }






    }
}
