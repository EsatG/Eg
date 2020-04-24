package day07_IfStatements;

public class MediumNumber {

    /*write a java program that accepts three numbers and rteurn the mediam number
            (assume that none of them are equal)   */

    public static void main(String[] args) {

        double a = 5.0 / 4;
        double b = 0;
        double c = -17;

        boolean aMedNumber = a < c && a > b || a < b && a > c;
        boolean bMedNumber = b < a && b > c || b < c && b > a;
        boolean cMedNumber = c < a && c > b || c < b && c > a;

        if (aMedNumber){
            System.out.println(a+ " is the medium number");

        }
        if (bMedNumber) {
            System.out.println(b + " is the medium number");
        }
        if (cMedNumber){
            System.out.println(c+ " is the medium number");
        }

    }





}
