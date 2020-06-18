package MyStudies;

class A {
    protected void methodA(){
        System.out.println("A");
    }

    public  void methodD(){
        System.out.println("D");
    }

}

class B extends A {

    @Override
    public void methodA(){
        System.out.println("C");
    }

    public void methodB(){
        System.out.println("B");
    }
}


public class Test {
    public static void main(String[] args) {

        A obj =  new B();
        obj.methodA();
        obj.methodD();

    }
}
