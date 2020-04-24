package day05_Unary_ShorthandOperators;

public class PostPre {
    public static void main(String[] args) {

        // pre; it changes the value of the variable immediately

        int a = 100;
        System.out.println(++a); // 101
        System.out.println(a); // 101

        int b = 100;
        System.out.println(--b); // 99
        System.out.println(b); //99

        //Post : first passes the current value, then eventually changes the variable value

        int A = 100;
        System.out.println(A++); // 100
        System.out.println(A);  // 101

        int B = 100;
        System.out.println(B--); // 100
        System.out.println(B);   // 99

        //post & Pre examples:
        int z = 10;
        int x = ++z; // atn line 28, x is increased by 1
        System.out.println(x); // 11
        System.out.println(z); // 11

        int s = 10;
        int f = s ++;
        System.out.println(f);
        System.out.println(s);

        double t1 = 3.5;
        double t2 = t1--;
        System.out.println(t2);
        System.out.println(t1);

        int c =25;
        System.out.println(c++); // 25
        System.out.println(c--); // 26
        System.out.println(c);  // 25

        int k = 50;
        k= --a + a++ + a-- + a++;
        System.out.println(k);








    }




}
