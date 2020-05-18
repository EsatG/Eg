package day41_Inheritance.Task01;

public class Developer extends Employee{

    /*
    create subclass of employee name it Developer:

		variables: salary, name, id, jobTitle,gender
		Actions : fixingBug, coding
		create a constructor that can initialize all the attributes of Developer

     */

    public void fixing(){
        System.out.println(name + " is fixing the bugs");
    }

    public void coding(){
        System.out.println(name + " is coding");
    }

    public Developer(String name, double salary, long id, String jobTitle, char gender){

        this.name = name;
        this.salary = salary;
        this.id = id;
        this.jobTitle = jobTitle;
        this.gender = gender;
    }




}
