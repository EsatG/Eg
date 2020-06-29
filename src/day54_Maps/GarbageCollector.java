package day54_Maps;

public class GarbageCollector {

    public static void main(String[] args) {

   new GarbageCollector();  // object is created in the Java Heap memory, this object will be collected by garbage collector

        GarbageCollector obj = new GarbageCollector(); // if the object has raference it will not be collected by garbage collector

        System.out.println("Done");

        String str = new String("Cybertek");
        str = new String("MIT");

        Integer num = new Integer(123);
                num = new Integer(124);

                // 123 will be collected by garbage collector

        Double n = new Double(0.5);
        n = null;  // by nulling the reference, it will be eligible for garbage collector

        System.out.println(n);

        GarbageCollector obj2 = new GarbageCollector();
        // obj2.finalize();


    }
}
