package day41_Inheritance;

import day41_Inheritance.Data;

public class TestData {

    public static void main(String[] args) {

        System.out.println(Data.a);

            Data.method1();

        // System.out.println(TestData.a); error=>> TestData class does not have any variable
        // TestData.method1(); error=> TestData class does not have any method

        // This is the difference between import and inherit.They are not related at all
    }


}
