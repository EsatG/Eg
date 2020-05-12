package day37_Constructors;

public class CybertekStudents {

    static String schoolName = "Cybertek";
    String studentName;
    int groupNumber;
    int batch;

    public CybertekStudents( String studentName,int groupNumber,int batch){
       // schoolName = "Cybertek";
        this.studentName = studentName;
        this.groupNumber = groupNumber;
        this.batch = batch;
    }

    public String toString(){
        return "School Name: " + schoolName + ", Student Name: " + studentName +
                ", Batch: " + batch + ", Group number: " + groupNumber;
    }


}

    class CybertekObj{

        public static void main(String[] args) {

            CybertekStudents student1 = new CybertekStudents("Esat",17,18);
            CybertekStudents student2 = new CybertekStudents("Andi",15,18);
            CybertekStudents student3 = new CybertekStudents("Yucel",16,18);

            student1.schoolName = "Cybertek School";  // re-initialized school name

            System.out.println(student1);
            System.out.println(student2);
            System.out.println(student3);

        }
    }

