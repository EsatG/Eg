package day39_AccessModifiers;

public class CheckInfo {

    public static void main(String[] args) {

        System.out.println("Name is: " + PersonalInfo.name);
        System.out.println("Gender is: " + PersonalInfo.gender);
        System.out.println("Age: " + PersonalInfo.age);
        System.out.println("Grade is: " + PersonalInfo.grade);

        // System.out.println("SSN: " + PersonalInfo.SSN); // it is private so it can not be accesible out of the class
        // System.out.println("ID: " + PersonalInfo.ID);

        PersonalInfo obj = new PersonalInfo();

        System.out.println(obj.name);
        System.out.println(obj.gender);
        System.out.println(obj.grade);
        System.out.println(obj.age);

        // System.out.println(obj.SSN); // error=> private can not be called outside of its own class


    }
}
