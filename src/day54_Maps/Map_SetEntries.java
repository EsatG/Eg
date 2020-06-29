package day54_Maps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

public class Map_SetEntries {

    public static void main(String[] args) {

        LinkedHashMap<String,String> facebook = new LinkedHashMap<>();
        facebook.put("Tester1", "password1");
        facebook.put("Tester2", "password2");
        facebook.put("Tester2", "password3");
        facebook.put("Tester3", "password4");
        facebook.put("Tester4", "password5" );
        facebook.put("Tester5", "password6");

        System.out.println(facebook);

        System.out.println(facebook.keySet()); // [Tester1, Tester2, Tester3, Tester4, Tester5]

        for (String eachKey : facebook.keySet()){

            System.out.println(eachKey + ": " + facebook.get(eachKey));
        }
        List<String> usernames = new ArrayList<>(facebook.keySet());
        System.out.println(usernames);  // [Tester1, Tester2, Tester3, Tester4, Tester5]

        System.out.println("=======================================================================================");

        System.out.println(facebook.values());  // [password1, password3, password4, password5, password6]

        for (String eachValue : facebook.values()){
            System.out.println(eachValue);
        }

        List<String> passwords = new ArrayList<>(facebook.values());
        System.out.println(passwords);  // [password1, password3, password4, password5, password6]

        System.out.println("================================================================================");

        LinkedHashMap<String,Integer> students = new LinkedHashMap<>();
        students.put("Mike",75);
        students.put("Brian",92);
        students.put("Omer Cevdet",98);
        students.put("Hanna",66);
        students.put("Frank",89);

        LinkedHashMap<String , Integer> badStudents = new LinkedHashMap<>();
        LinkedHashMap<String , Integer> goodStudents = new LinkedHashMap<>();

        for( String eachKey: students.keySet() ){

            int eachValue = students.get(eachKey);
            if (eachValue < 90 ) {
               badStudents.put(eachKey,eachValue);
            } else {
                goodStudents.put(eachKey,eachValue);
            }
        }

        System.out.println(badStudents);
        System.out.println(goodStudents);







    }
}
