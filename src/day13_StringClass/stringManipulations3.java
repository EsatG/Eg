package day13_StringClass;

public class stringManipulations3 {
    public static void main(String[] args) {

        String str = "I like java programming john";
        int num1 = str.indexOf("john");
        System.out.println(num1);

        String str2 = "Cybertek school is awesome";
        int firstS = str2.indexOf("s");
        int secondS = str2.indexOf("is") + 1;
        System.out.println(firstS);
        System.out.println(secondS);

        int maxIndexNumber = str2.length() - 1;
        System.out.println(maxIndexNumber);
        int maxindex = "Cybertek".length() - 1;
        System.out.println(maxindex);

        String names = "Muhtar";
        int a1 = names.indexOf("Good Guy"); // if the value is not exist in the string, it will return negative number
        System.out.println(a1);
        System.out.println("=======================================================================");

        String fullname = "Esat Gorgun";
        String firstname = fullname.substring(0,fullname.indexOf(" ") );
        String lastname = fullname.substring(fullname.indexOf(" ") +1);
        System.out.println(firstname);
        System.out.println(lastname);







    }
}
