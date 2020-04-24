package day14_StringClass;

public class WebAddress {

    public static void main(String[] args) {

        /* write a program that can validate if a web address is valid
        valid web adress : MUST starts with www.
                           MUST end with   .com ,  .edu , .net , .gov
         */

        String website = "WWw.cybertek.GoV";
        website = website.toLowerCase();

        boolean validend = website.endsWith(".com") || website.endsWith(".edu") || website.endsWith(".gov")
                || website.endsWith(".net");

        if (website.startsWith("www.") && validend) {

            System.out.println("Valid Address");

        } else {
            System.out.println("Invalid Adress");
        }






    }
}

