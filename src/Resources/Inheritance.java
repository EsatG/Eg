package Resources;

import day42_Inheritance.Data;

public class Inheritance extends Data {

    public static void main(String[] args) {

        System.out.println(Inheritance.publicData);//  can be always inherited to anywhere
        System.out.println(Inheritance.protectedData);// can be always inherited to anywhere

        // System.out.println(Inheritance.defaultData); error=> default is not visible outside of package so it can not be inherited outside of package
        // System.out.println(Inheritance.privateData);error=> private is not visible outside of its own class so private can never be inherited


    }
}
