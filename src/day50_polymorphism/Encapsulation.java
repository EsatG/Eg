package day50_polymorphism;

public class Encapsulation {

    private  String username = "Cybertek";

    public  String getUsername(){  //
       return username;
    }

    public void setUsername(String username){
        this.username = username;
    }


}

class Test{
    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation();
        // obj.username; // error=> Because "username" is private

        System.out.println(obj.getUsername());  // cybertek

        obj.setUsername("esat");

        System.out.println(obj.getUsername()); // esat

    }

}
