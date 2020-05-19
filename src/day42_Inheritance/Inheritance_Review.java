package day42_Inheritance;

class B {

    public B(int a){
        System.out.println("int");
    }
    public B(double a){
        System.out.println("double");
    }
    public B(long a){
        this(2.3);
        System.out.println("long");
    }

}

public class Inheritance_Review extends B {

    public Inheritance_Review(String a){
        super(12L);
        System.out.println("String");
    }

    public static void main(String[] args) {

        Inheritance_Review obj = new Inheritance_Review("");
    }


}
