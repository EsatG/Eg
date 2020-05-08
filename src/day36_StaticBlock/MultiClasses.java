package day36_StaticBlock;

// we can have multiple classes in a java file as long as there is only one public class.public class's name must be same with file name

class Tester{
    public static void main(String[] args) {
        System.out.println("Tester class");
    }

}

class Developer{
    public static void main(String[] args) {
        System.out.println("Developer class");
    }


}

class scrumTeam{
    public static void main(String[] args) {
        System.out.println("Scrum Team class");
    }

}

public class MultiClasses {
    public static void main(String[] args) {
        System.out.println("public class");
    }
}

