package day35_Static;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student();
            student1.name = "Esat";
        System.out.println(student1);

        Student student2 = new Student();
            student2.name = "Andi";
        System.out.println(student2);

        Student.printSchoolName();



    }
}
