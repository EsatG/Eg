package day06_Shorthand_LogicalOperators;

public class warmUp {

    public static void main(String[] args) {

        double numberOfGalons = 1;
        double galonsToLiters = numberOfGalons * 3.785;
        String result = numberOfGalons + " galons is equal to: " + galonsToLiters+ " liters";

        System.out.println(result);
        System.out.println("===========================================================================");

        double numberOfLiters = 100;
        double litersToGalons = numberOfLiters / 3.785;
        String result2 = numberOfLiters + " liters equal to " + litersToGalons +" galons";
        System.out.println(result2);
        System.out.println("===================================================================================");

        int a = 200;
        int b = -a++ + - --a * a-- % 2;
        //  b=  -200 +  -200 * 200 % 2
        //  b=   -200 + -40000 % 2
        //  b=  -200  + 0
        //  b=  -200
        System.out.println(a);
        System.out.println(b);

        System.out.println("===========================================================================");

        int x = 300;
        int y = 400;
        int z = x + y - x * y + x / y;
                                // 300 / 400=0 because compiler define it as integer

        System.out.println(z);
        System.out.println("========================================================================");



    }


}
