package day53_Iterable_Maps;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iterating_Collection {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5));

        for (int i = 0; i < list.size(); i++){
            if (list.get(i) < 4){
                list.remove(i);
            }
        }
        System.out.println(list);  // it will not remove all of the <4 objects,

        System.out.println("=================================================");

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5));
        list2.removeIf(p-> p < 4);  // it uses iterator interface internally, so all of the <4 objects will be removed

        System.out.println(list2);

        System.out.println("====================================================================");

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5));
        Iterator<Integer> itr = list3.iterator();

        while (itr.hasNext()){
            if (itr.next() < 4){
                itr.remove();
            }
        }

        System.out.println(list3);

        System.out.println("===========================================================================");

        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5));

        for ( Iterator<Integer> I = list4.iterator(); I.hasNext(); ){

            int num = I.next();

            if ( num < 4){
                I.remove();

            }
        }

        System.out.println(list4);



    }


}
