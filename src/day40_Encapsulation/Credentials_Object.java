package day40_Encapsulation;

public class Credentials_Object {

    public static void main(String[] args) {

        Credentials facebook = new Credentials();

        facebook.setUserName("Esat");
        facebook.setPassword("Esat123.");

        System.out.println(facebook.getUserName());
        System.out.println(facebook.getPassword());



    }

}
