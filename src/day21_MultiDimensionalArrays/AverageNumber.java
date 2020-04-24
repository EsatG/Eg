package day21_MultiDimensionalArrays;

import java.text.DecimalFormat;

public class AverageNumber {
    public static void main(String[] args) {

        DecimalFormat  DF = new DecimalFormat("0.00");

        double [] arr = {10, 20, 30, 40, 50};
        // average = sum of all numbers / length

        double length = arr.length; // total numbers of the elements


        double sum =0;
        for (int i = 0; i <= length-1; i++){
            double eachnum = arr [i];
            sum += eachnum;

        }
        System.out.println(sum);
        double average = sum /  length;
        System.out.println(DF.format(average));







    }
}
