package day14_StringClass;

public class stringManipulations3 {
    public static void main(String[] args) {

        String str1 ="CYBERTEK";
        String STR2 ="cybertek";

        System.out.println(str1.equals(STR2));   // false
        System.out.println(str1.equalsIgnoreCase(STR2));  // true, ignores case sensitivity

        System.out.println("================================================================");

        String s1 = "Cybertek School";
        boolean r1 = s1.contains("School");
        System.out.println(r1);

        System.out.println("==================================================================");

        String s2 ="United States";
        boolean result = s1.startsWith("U");

        String s4 = "Cybertek School";
        System.out.println(s4.endsWith("l"));      // true
        System.out.println(s4.endsWith("School"));  // true
        System.out.println(s4.endsWith("Cybertek"));  // false

        System.out.println("");



    }
}
