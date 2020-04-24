package day13_StringClass;

public class stringManipulations2 {
    public static void main(String[] args) {

        String str = "Cybertek Schoool is the best";
        String schoolName = str.substring(0,8);  // ending index is excluded
        System.out.println(schoolName);

        String fullName = "Esat Gorgun";
        String firstName = fullName.substring(0,4);
        String lastName = fullName.substring(5,11);
        System.out.println(firstName);
        System.out.println(lastName);

        // gmail: lastName_firstName@gmail.com

        String Murtaza = "Murtaza Nazeeri";
        String firstname = Murtaza.substring(0,7);
        String lastname = Murtaza.substring(8,15);

        String gmail = lastname.concat("_").concat(firstname).concat("@gmail.com");
        System.out.println(gmail);

        String s1 = "I love Java Programming Language";
        String classname  = s1.substring(7);
        System.out.println(classname);
        System.out.println("=====================================================================");

        String s2 = "I like C# Programming C#";
        s2 = s2.replace("C#","Java");
        System.out.println(s2);

        String name = "COVID 18";
        name = name.replace("8", "9");
        name = name.toLowerCase();
        System.out.println(name);
        System.out.println("==========================================================================");

        String r1 = "I like C#, C# is fun, C# is cool";
        r1 = r1.replaceFirst("C#", "Java");
        System.out.println(r1);

        String r2 = "Tomorrow is Monday, Tomorrow is Tuesday";
        r2 = r2.replaceFirst("Tomorrow","Today" );
        System.out.println(r2);
        System.out.println("===========================================================================");






    }
}
