package day26_MethodOverLoading;

public class MethodOverLoading {

    public static void main(String[] args) {
        method(10);  // original method
        method(4,3);  // overloaded method
    }

    public static void method (int a){
        System.out.println("Original method");
    }

    public static void method(int a, int b){       //  public static void method(double a) is also overloaded because of data type
        System.out.println("Overloaded method");

        // as long as  is parameters are different method name can be same

    }

    public static int sum (int a,int b){
        return a + b;
    }
    public static int sum (int a,int b, int c){
        return a + b + c;
    }
    public static int sum (int a,int b, int c, int d){
        return a + b + c + d;
    }












}
