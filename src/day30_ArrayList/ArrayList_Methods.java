package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {

    /*
    add (object) : adds objects to the arraylist
    add(index,Object) : adds the object at the given index
    set(index, element): set the elements at the given index,
                         replaces the original object at given index with the new given object
    remove (int index):  object at the given index will be removed
    remove(object): given object will be removed, returns boolean
    clear() : remove eveything from arraylist, size will be zero(0)
    indexOf() : it will return you index number of the object
    lastIndexOf: it will return you index number of the last index
     */
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
                    list1.add(5);
                    list1.add(7);
                    list1.add(8);

                    list1.add(1,6);
                  //  list1.add(7,10);   // it gives exception since index out of bound

                    list1.set(3,9);  // 8 was replaced by 9

        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add(1,"C");
        list2.add(1,"D");

        list2.set(3,"F");
        list2.set(2,"E");

        System.out.println(list2);
        System.out.println("======================================================================");

        ArrayList<Integer> list3 = new ArrayList<>();
                    list3.add(1);
                    list3.add(2);
                    list3.add(3);
                    list3.add(4);

        int a = 1;
            list3.remove(a);   // [1,3,4]    // a is an primitive so it represent to index

        Integer b = 1;
        list3.remove(b);    // [2,3,4]  // b is an object, object will be removed
        System.out.println(list3);

        ArrayList<Integer> list4 = new ArrayList<>();
                    list4.add(10);
                    list4.add(20);
                    list4.add(30);

        //  list4.remove(20);  // there is nothing at index 20, index out of bound
         // list4.remove(1); // it removes the object which is at index 1

        Integer a2 = 20;   // if we give a2 = 100 it will return us as false
       boolean r1 =  list4.remove(a2);   // a2 is object

        System.out.println(list4);
        System.out.println(r1);



















    }
}
