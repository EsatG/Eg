package day39_AccessModifiers;

public class Test {

    public static void main(String[] args) {

        AccessModifiers obj1 = new AccessModifiers();
        System.out.println(obj1.defaultAccess);
        System.out.println(obj1.publicAccess);
        // System.out.println(obj1.privateAccess); // error=> private:only accessible within the same class


    }
}
