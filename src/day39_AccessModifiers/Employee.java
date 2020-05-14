package day39_AccessModifiers;

public class Employee {

    String name;
    String jobTitle;
    long id;
    double salary;
    char gender;
    static String company = "BOA";

    public Employee(String name){

        this.name = name;

    }

    public Employee (String name,String jobTitle){

        this(name);
        this.jobTitle = jobTitle;
    }

    public Employee (String name,String jobTitle,long id){

        this(name,jobTitle);
        this.id= id;
    }

    public Employee (String name,String jobTitle,long id, double salary){

        this(name,jobTitle,id);
        this.salary= salary;
    }
    public Employee (String name,String jobTitle,long id, double salary,char gender){

        this(name,jobTitle,id,salary);
        this.gender= gender;
    }

    public String toString(){
        return "Name: " + name + ", Gender: " + gender + ", Company Name: " + company + ", Job Title: " + jobTitle + ", ID: " + id + ", Salary: $" + salary;
    }


}

class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 =   new Employee("Andi");
            System.out.println(employee1);

        Employee employee2 = new Employee("Yucel","SDET");
            System.out.println(employee2);

        Employee employee3 = new Employee("Korkut","QA",123);
            System.out.println(employee3);

        Employee employee4 = new Employee("Esat","Developer",456,110000);
            System.out.println(employee4);

        Employee employee5 = new Employee("Omer Cevdet","Senior Developer",789,150000,'M');
            System.out.println(employee5);


    }
}
