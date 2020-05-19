package day42_Inheritance.Task01;

import java.util.ArrayList;
import java.util.Arrays;

public class School {
    /*
    create 3 objects of student and set their info
					create a an ArrayList of students to store all student objects
					use for each loop to print out each students' name and studentID
     */

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setStudentInfo("Esat",39,'M',123,"17");
        student2.setStudentInfo("Andi",30,'M',456,"14");
        student3.setStudentInfo("Yucel",50,'M',798,"15");

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.addAll(Arrays.asList(student1,student2,student3));

        for (Student each : studentList){

            System.out.println("Name: " + each.name + ", ID: " + each.studentID);
        }





    }





}
