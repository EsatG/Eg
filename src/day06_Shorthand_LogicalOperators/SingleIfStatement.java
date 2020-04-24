package day06_Shorthand_LogicalOperators;

public class SingleIfStatement {

    public static void main(String[] args) {

        boolean coldWeather = false;
        if (coldWeather) {
            System.out.println("Wear your hat");
            System.out.println("Wear your jacket");


        }

        boolean coronaDetected = true;
        if(coronaDetected) {
            System.out.println("Buy more toilet papers");
            System.out.println("Buy more water");
            System.out.println("Stay at home");
            System.out.println("Do more java coding");

        }
        System.out.println("=======================================================================");

        int a = 101;

        boolean evenNumber = a % 2==0; // if a number can be divided by 2 without a remainder
        boolean oddNumber = a % 2 !=0;  // if the number can not be divided by 2 evenly
        if (evenNumber){
            System.out.println(a +" is an even number" );
        }
        if(!evenNumber){     // if the number is not even number, then it is must be odd
            System.out.println(a + " is odd number");
        }

        // the codes only get executed if the condition is true


    }


}
