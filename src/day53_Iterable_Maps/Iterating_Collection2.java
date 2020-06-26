package day53_Iterable_Maps;

import java.util.*;

public class Iterating_Collection2 {

    public static void main(String[] args) {

        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Muhammed","Esat","Omer","Ali","Yucel","Cevdet","Omer","Dilber","Mike","Omer","Osman","Mehmet"));
        System.out.println(names);

        Iterator<String> it = names.iterator();

        while (it.hasNext()){
            String s = it.next();
            if (s.toLowerCase().contains("m")){
                it.remove();
            }
        }

        System.out.println(names);

        System.out.println("======================================================================");

        LinkedHashSet<String> students = new LinkedHashSet<>();
        students.addAll(Arrays.asList("Muhammed","Esat","Omer","Ali","Yucel","Cevdet","Omer","Dilber","Mike","Omer","Osman","Mehmet"));

        for (Iterator<String> I = students.iterator(); I.hasNext(); ){

            String s = I.next();
            if (s.toLowerCase().contains("m")){
                I.remove();
            }
        }

        System.out.println(students);

        System.out.println("============================================================================");

        LinkedHashSet<String> friends = new LinkedHashSet<>();
        friends.addAll(Arrays.asList("Muhammed","Esat","Omer","Ali","Yucel","Cevdet","Omer","Dilber","Mike","Omer","Osman","Mehmet"));

        friends.removeIf(p-> p.toLowerCase().contains("m"));

        System.out.println(friends);

        System.out.println("=============================================================================");

        LinkedHashSet<String> people = new LinkedHashSet<>();
        people.addAll(Arrays.asList("Muhammed","Esat","Omer","Ali","Yucel","Cevdet","Omer","Dilber","Mike","Omer","Osman","Mehmet"));

        people.removeAll( Arrays.asList("Omer","Esat","Ali") );
        System.out.println(people);

        System.out.println("================================================================================");

        LinkedHashSet<String> guys = new LinkedHashSet<>();
       guys.addAll(Arrays.asList("Muhammed","Esat","Omer","Ali","Yucel","Cevdet","Omer","Dilber","Mike","Omer","Osman","Mehmet"));

       guys.retainAll(Arrays.asList("Esat","Omer","Dilber"));
        System.out.println(guys);

        System.out.println("=================================================================================");

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7));

        // verify 5,6,9,8 are contained in the list

        boolean result = list.containsAll(Arrays.asList(5,6,9,8));

        System.out.println(result);









    }

}
