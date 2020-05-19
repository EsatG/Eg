package day42_Inheritance;

public class TestData extends Data{

    /*
    public  (inherited)
    default (inherited)
    protected  (inherited)
     */

    public static void main(String[] args) {

        System.out.println(TestData.publicData);
        System.out.println(TestData.protectedData);
        System.out.println(TestData.defaultData);
        // System.out.println(TestData.privateData); error=> private is not visible outside of its own class so private can never be inherited

    }






}
