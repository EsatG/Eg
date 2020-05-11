package day37_Constructors;

public class StatticsReview {

    static int a;  // just one copy
    int b;    // each object has its own copy of instance variable

    public static void main(String[] args) {

        StatticsReview obj1 = new StatticsReview();
        obj1.a = 20;
        obj1.b = 10;

        StatticsReview obj2 = new StatticsReview();
        obj2.a = 30;

        System.out.println(obj1.a);  // 30
        System.out.println(obj2.a);  // 30

        System.out.println(obj1.b);  // 10
        System.out.println(obj2.b);  // 0
    }









}
