package day41_Inheritance.Task01;

public class Employee {

    /*
    create class called Employee:

        variables: salary, name, id, jobTitle,gender
        Actions : toString
     */

    public String name;
    public double salary;
    public long id;
    public String jobTitle;
    public char gender;

    public String toString(){
        return "Name: " + name + ", JobTitle: " + jobTitle + ", Salary: $" + salary + ", ID: " + id + ", Gender: " +gender;
    }




}
