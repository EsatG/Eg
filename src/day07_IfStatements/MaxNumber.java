package day07_IfStatements;

public class MaxNumber {
    public static void main(String[] args) {

        /*write a java program that accepts three numbers and return the maximum number
				(assume that none of them are equal)    */

        double a = 100.5;
        double b = 200.4;
        double c = 300;

        boolean aGreater = a >b && a >c;
        boolean bGreater = b > a && b > c;
        boolean cGreater = c > a && c > b;

        if (aGreater){
            System.out.println("a is the max number");
        }
        if (bGreater){
            System.out.println("b is the max number");
        }
        if (cGreater){
            System.out.println("c is the max number");
        }





    }
}
