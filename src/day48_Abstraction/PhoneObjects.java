package day48_Abstraction;

public class PhoneObjects {

    public static void main(String[] args) {

        iPhone obj1 = new iPhone("11",699,"10 inches");
        iPhone obj2 = new iPhone("X",1000,"8 inches");

        System.out.println(obj1);
        System.out.println(obj2);

        obj1.FaceTiming(123456789);
        obj2.calling(911);
        obj1.texting(154264585);

        System.out.println("==============================================================");

        Samsung samsung1 = new Samsung("A5",400,"11 inches");

        System.out.println(samsung1);

        samsung1.freezing();
        samsung1.calling(1230245888);
        samsung1.texting(51564841);




    }

}
