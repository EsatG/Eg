package Day04_JavaRecap;

public class Variable_Practice {

    public static void main(String[] args) {

        // DataType variableName = Data;

        byte num1 = 127;
        short num2 = num1; // double > float > long > int > short > byte
        int num3= num2;  // int is prefered by compiler
        long num4 = 99999999999l;
        float num5= 100L;
        float num6=0.5f;
        System.out.println(num6);
        System.out.println(num5);
        double num7= 0.5f;
        double num8= 99999999L;
        double num9= 100.5;

        char ch1 = '$';  //every single character has a corresponding number
        System.out.println(ch1); // $

        char ch2= 4500; // 0--65565
        System.out.println(ch2);

        int a1 = '8';
        System.out.println(a1); // 56

        int a2 = 'z';
        System.out.println(a2);

        double d1= 'z' + '8';
        System.out.println(d1);

        char ch3 = 178;
        System.out.println(ch3);

        char ch4 = 'z' + '8';
        System.out.println(ch4);

        boolean bool1 = true;
        boolean bool2 = false;
        /* Comparision Operators:  both data must be matching when we apply those
				> : greater
				>= : greater or equal
				< : less
				<= : less or equal
				== : equal
				!= : not equal
				! : opposite   */

        System.out.println( 9 > 10);  //false
        System.out.println(9 >= 9);  //true
        System.out.println(9!=10);   //true
        System.out.println('a'=='b');  //false
        System.out.println('a'=='b' - 1);  //true
       // System.out.println('a'=="a");  //  does not match
        System.out.println('a'==97);  // true
        System.out.println("Esat" == "Good Guy");
        System.out.println("Esat"!="Good Guy");
        System.out.println("Esat"=="esat");
         // System.out.println("Apple"==1500); does not match

        System.out.println(!true == false); //true
        System.out.println(!true == !false);  //true






    }

}
