package day06_Shorthand_LogicalOperators;

public class ShorthandOperators {

    public static void main(String[] args) {

        int x = 20;
        x+= 10;    // x = x + 10
        System.out.println(x);  // 30

        x += 60;  // x = X + 60
        System.out.println(x);    // 90

        String schoolname = "Cybertek";
        schoolname += 12345;   // schoolname = schoolname + 12345
        System.out.println(schoolname);

        System.out.println('a' + 'b');
       //                   97    98  ==> 195

        char ch1 = 'a';
             ch1 += 'b';
        System.out.println(ch1);    // character

        int num = 'z';
            num += 'x';
        System.out.println(num);
        System.out.println("===========================================================");

        int A = 100;
        A -=90;
        System.out.println(A);

        int B = 200;
        B -= A;    // B = B - A
        System.out.println(B);   // 190
        System.out.println("===============================================================");

        int a = 2;
        a *= 3;
        System.out.println(a);
        int b = a *=10;    // b= a = a * 10 = 60
        System.out.println(b);
        System.out.println(a);

        int a1 = 100;
        int b1 = (a1 *= 2) +  ++a1;
        //  b1 = 200     +    201
        // b1 = 401
        System.out.println(b1);

        int x1 = 10;
        int y = x1 += 10*2;
        System.out.println(y);

        int q = 20;
        int p = q *= 20 * 3;
        System.out.println(p);
        System.out.println("===============================================================================");

        int num1 = 300;
        num1 /= 2;  // num1 = num1 / 2
        System.out.println(num1);

        int num2 = 400;
        num2 /= 20 + 10;  // num2 = num2 / 30
        System.out.println(num2);
        System.out.println("==============================================================================");

        int num3 = 300;
        num3 %= 10 + 20;  // num3 %= 30  ==> num3 = num3 % 30
        System.out.println(num3);

        int n1 = 400;
        n1 %= 3*5;  // n1 %=15  ==>  n1 = n1 % 15
        System.out.println(n1);



    }
}
