package day42_Inheritance;


class test{

    public test(int a){
        System.out.println("A");
    }

    public test (double a){
        this(1);
        System.out.println("C");
    }
}

public class Constructor2 extends test {

    public Constructor2(){
        super(1.2);  // "super()" keyword refers to the object insance of the super class.Used for calling the constructors from super class
        System.out.println("B");
    }

    public static void main(String[] args) {
        //test obj = new test(10);  //   A

       Constructor2 obj = new Constructor2();  // A C B
    }
}
