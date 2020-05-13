package OfficeHours.Practice_05_13_2020;

public class Student {

    String name;
    long id;
    static String school = "Cybertek";


    public String toString(){

        return "Name: " + name + ", ID: " + id + ", School: " + school;
    }

}

class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student();
                student1.name = "Esat";
                student1.id = 123;

        Student student2 = new Student();
                student2.name = "Andi";
                student2.id = 456;

        System.out.println(student1);
        System.out.println(student2);
    }
}
