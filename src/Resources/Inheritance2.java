package Resources;

import day42_Inheritance.AccessModifiers;

public class Inheritance2 extends AccessModifiers {

    public static void main(String[] args) {

        System.out.println( Inheritance2.publicVariable);
        System.out.println(Inheritance2.protectedVariable);

       //  System.out.println(Inheritance2.defaultVariable);error=>default can not inherited to outside of its own package
        // System.out.println(TestData2.privateVariable); error=> private can never be inherited

        Inheritance2.publicMethod();
        protectedMethod();

       //  Inheritance.defaultMethod(); error=>default can not inherited to outside of its own package
        // TestData2.privateMethod(); error=> private can never be inherited
    }
}
