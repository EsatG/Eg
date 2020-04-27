package day29_Wrapper_ArrayList;
import java.util.ArrayList;
public class List_Intro {

    /*
    ArrayList is a class. to use Arraylist we need to provide import java.util.ArrayList;
    ArrayList does not support primitives.it only support non-primitives
    ArrayList< DataType> listName = new ArrayList<DataType>();
    ArrayList size is dynamic ,it means automatically adjusted
    has index numbers
    Methods of ArrayList:
         add () : adds non-primitives (objects) to the ArrayList
         get(index) : gets the object at the given index, returns the object
         size () : returns the length (size) of the arraylist as an int

     */
    public static void main(String[] args) {

        ArrayList <Integer> scores = new ArrayList<Integer>();  // size :0
                                             // add five elements, size : 5
                                            // remove two elements size : 3
        scores.add(10);  // autoboxing  Size is gonna be 1
        scores.add(20);  // size: 2
        scores.add(30);  // size: 3
        System.out.println(scores);

        Integer a1 = scores.get(2);    // neither autoboxing nor unboxing
        int a2 = scores.get(2);        // unboxing
        double a3 = scores.get(2);     // unboxing

        System.out.println(a1);

        // System.out.println(scores.get(100));   // index out of bound



















    }
}
