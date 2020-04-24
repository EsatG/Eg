package day26_MethodOverLoading;

public class MethodOverLoading3 {

    /*
    first method : can find the sum of two int numbers
    second method : can find the sum of two double numbers
     */

    public static void main(String[] args) {

        sum(10,5);
      double num1 = sum(1.5,2.5);
        System.out.println(num1);

       double num2 =  sum(25L,30L);
        System.out.println(num2);

        sum((int)40L,(int)50L);    // explicit casting of long to int

        // double num3 = sum(5,4);   it gives compile error since void method does not return any value

    }


    public static void sum (int a,int b){
        System.out.println(a + b);
    }

    public static double sum (double a,double b){  // in method overloading, return type doesn't matter

        return  a + b;
    }









}
