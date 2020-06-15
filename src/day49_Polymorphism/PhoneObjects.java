package day49_Polymorphism;

public class PhoneObjects {

    public static void main(String[] args) {

        iPhone phone1 = new iPhone("X",999,"11 inches");

        System.out.println(phone1);
        phone1.faceTiming(123466);
        phone1.calling(4569821);
        phone1.texting(46766931);
        phone1.download();


    }
}
