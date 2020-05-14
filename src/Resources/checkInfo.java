package Resources;

import day39_AccessModifiers.PersonalInfo;

public class checkInfo {

    public static void main(String[] args) {

        System.out.println(PersonalInfo.name);
        System.out.println(PersonalInfo.gender);

        // System.out.println(PersonalInfo.grade);  //error=>  grade is default and it is not  accessible outside of its  package
       // System.out.println(PersonalInfo.age);    //error=>  age is default and it is not  accessible outside of its own package

        // System.out.println(PersonalInfo.SSN);  //error=>  SSN is private and it is not  accessible outside of its  own package
        // System.out.println(PersonalInfo.ID);   //error=>  ID is private and it is not  accessible outside of its  own package

        PersonalInfo obj = new PersonalInfo();
        System.out.println(obj.name);

        // System.out.println(obj.grade);   //error=>  grade is default and it is not  accessible outside of its  package

        // System.out.println(obj.SSN); // error=>  SSN is private and it is not  accessible outside of its  own package


    }
}
