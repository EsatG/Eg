package Day04_JavaRecap;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int a =10 / 3; //3
        System.out.println(a);

        System.out.println(10 / 4);  //2

        System.out.println(10.0 / 4);  //2.5

        double d = 10 / 4;
        System.out.println(d); //2.0

        double d1 =10.0 / 4;
        System.out.println(d1);  //2.5
        System.out.println(10.0 / 4.0);  // 2.5

        float f1 = 10 / 4;
        System.out.println(f1);  // 2.0
        float f2 = 10 / 4f;
        System.out.println(f2);  //2.5

        /* remainder = numerator -(denominator * result of whole number)
        10 / 4 =2.5    remainder : 10 - (4 * 2 ) = 2
        remainder of 10/4 is 2
        10 % 4==>2     15 % 3==>0
         */
        // odd number: not evenly divisible by 2 ==> remainder is not 0
        // even number: evenly divisible by 2==> remainder is 0

        boolean evenNumber = 25 % 2 ==0; // if 25/2 has a remainder of zero, then it is even number
        System.out.println(evenNumber); //false
        System.out.println(25 % 2 );

        boolean oddNumber = 22 % 2 !=0; //22 is even num
        System.out.println(oddNumber);

        System.out.println(10 % 2==0);  //10 is even number
        System.out.println(11 % 2!=0);  // 11 is odd number
        System.out.println("==================================================================================");

        System.out.println("10 is even number: "+ (10 % 2==0));
        System.out.println("11 is even number: " + (11 % 2==0));

        System.out.println("25 is odd number: " + (25 % 2 !=0));
        System.out.println("25 is even number: " + !(25 % 2 !=0) );
        System.out.println("25 is even number: " + (25 % 2==0)  );







    }
}
