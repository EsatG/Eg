package day13_StringClass;

public class stringManipulations {
    public static void main(String[] args) {

        String str = "Cybertek";
         // index num 01234567

        char ch1 = str.charAt(5);  // t
        System.out.println(ch1 == 'A');  // false


        System.out.println(ch1 == 'T');   // false
        System.out.println(ch1 == 't');   // true
        System.out.println("=========================================================================");

        int totalLength = str.length();   // 8
        System.out.println(totalLength);

        System.out.println(totalLength > 250);   // false

        String str2 = "Today is great day, Java is fun";
        int maxIndexNum = str2.length() - 1;
        System.out.println(maxIndexNum);
        System.out.println("==============================================================================");

        String s1 = "Cybertek";
        s1 = s1.concat(" School");  // Cybertek School
        System.out.println(s1);

        String s2 = "Java";

        System.out.println(s2.concat(" is a programming language"));
        System.out.println(s2);
        s2 = s2.concat(" is a programming language");
        System.out.println(s2);

        String r1 = "Java is fun";
        r1 = r1.concat(", and it is easy");
        System.out.println(r1);
        System.out.println("========================================================================");

        String name1 = "CYBERTEK";
        name1 = name1.toLowerCase();
        System.out.println(name1);

        String name2 = "cybertek school";
        name2 = name2.toUpperCase();
        System.out.println(name2);
        System.out.println("========================================================================");

        String A1 = "                     Today is a great day               ";
        A1 = A1.trim();
        System.out.println(A1);






    }



}
