package day14_StringClass;

public class StringManipulations {
    public static void main(String[] args) {

        String str = "I like to learn Java. I like to watch yhe movie Jumanji";
        int a1 = str.indexOf("J");
        System.out.println(a1);

        int a2 = str.indexOf("Jum");
        System.out.println(a2);

        int a3 = str.indexOf(" I") + 1;  // index number of second I
        System.out.println(a3);
        System.out.println("========================================================================");

        String str2 = "I like Java, and I like reading";
        int a4 = str2.lastIndexOf("I");
        System.out.println(a4);

        int a5 = str2.lastIndexOf("l");
        System.out.println(a5);

        String s = "I like C#, C# is cool";
        int a6 = s.lastIndexOf("C");
        System.out.println(a6);

        String x = "I like Java, Java is fun, Java programming is fun";
        int b = x.indexOf("Java i");  // index number of second J
        System.out.println(b);

        int b1 = x.indexOf(", J") + 2;
        System.out.println(b1);

        int b3 = x.lastIndexOf("J");  // index number of last J
        System.out.println(b3);

        int b4 = x.indexOf("Java p");   // index number of last J
        System.out.println(b4);

        char ch = x.charAt(26);
        System.out.println(ch);



    }
}
