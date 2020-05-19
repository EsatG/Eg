package day42_Inheritance;

public class TestData2 extends AccessModifiers{

    public static void main(String[] args) {

        System.out.println( TestData2.publicVariable);
        System.out.println(TestData2.protectedVariable);
        System.out.println(TestData2.defaultVariable);
        // System.out.println(TestData2.privateVariable); error=> private can never be inherited

        TestData2.publicMethod();
        protectedMethod();
        TestData2.defaultMethod();
        // TestData2.privateMethod(); error=> private can never be inherited
    }
}
