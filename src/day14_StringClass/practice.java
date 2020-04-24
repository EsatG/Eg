package day14_StringClass;

public class practice {
    public static void main(String[] args) {

        String gmail = "gorgunesad@gmail.com";

        String userinputGmail = "GorgunEsad@gmail.com";

        boolean result = gmail.equalsIgnoreCase(userinputGmail);  // true

        if (result){
            System.out.println("Logged in");
        }

        System.out.println("=============================================================");

        /*
           valid password should not contain spaces
         */

        String password = "mmasd 1235";

        if (password.contains(" ")) {
            System.out.println("Password can not have space in it");
        } else {
            System.out.println("valid password");
        }

        /*  every website has "www." at the beginning of the web adress

         */
        String  webAddress = "WWW.amazon.com";
        webAddress = webAddress.toLowerCase();

        if (webAddress.startsWith("www.")) {
            System.out.println("Valid");

            System.out.println("====================================================");
        }

        /* every single gmail address ends with @gmail.com

         */
        String email = "Cybertekschool@Yahoo.com";
        if (email.endsWith("@gmail.com")) {
            System.out.println("Valid gmail address");
        } else {
            System.out.println("Invalid gmail address");
        }







    }
}
