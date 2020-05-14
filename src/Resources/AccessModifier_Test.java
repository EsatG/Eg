package Resources;

import  day39_AccessModifiers.AccessModifiers;

public class AccessModifier_Test {

    public static void main(String[] args) {

        AccessModifiers obj1 = new AccessModifiers();

       // System.out.println(obj1.defaultAccess);  compile error => default is only accessible in the same package

        System.out.println(obj1.publicAccess);  // public access modifier is always accessible

       // System.out.println(obj1.privateAccess); // error=> private:only accessible within the same class


    }
}
