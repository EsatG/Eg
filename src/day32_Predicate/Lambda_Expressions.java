package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expressions {
    public static void main(String[] args) {

        /*
        Predicate:
              Allow you to create your own condition based on data type.Can be applied to any colllection type
              Predicate<Integer> oddNumber = p -> p % 2 != 0;
         */

        Predicate<Integer> oddNumber = x -> x % 2 != 0;

        ArrayList<Integer> list = new ArrayList<>();
            list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
            list.removeIf(oddNumber);

        System.out.println(list);
        System.out.println("========================================================================");

        Predicate<Integer> lessThan5 = p-> p < 5;
        ArrayList<Integer> list2 = new ArrayList<>();
            list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

            list2.removeIf(lessThan5);

        System.out.println(list2);

        System.out.println("=============================================================================");

        Predicate<String> startsWithG = y -> y.startsWith("G");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Esat", "Omer","Cevdet","Dilber","Gorgun"));

        names.removeIf(startsWithG);   // remove Gorgun since it start with G

        System.out.println(names);

        System.out.println("=================================================================");

        Predicate<String> MorA = each -> each.startsWith("M") || each.startsWith("A");

        ArrayList<String> nameList = new ArrayList<>();
        nameList.addAll(Arrays.asList("Omer", "Alex","Arnold", "Ramazan", "Muhtar"));

        nameList.removeIf(MorA);   // remove the names which starts with M or A
        System.out.println(nameList);
        System.out.println("===========================================================");

        Predicate<Character> digits = c -> Character.isDigit(c);  //  c >= 48 && c <= 57;

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('A','B','3','4','5','@','&','Z'));

        chars.removeIf(digits);

        System.out.println(chars);

        System.out.println("===============================================================");


        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        nums.removeIf(p -> p > 5);

        System.out.println(nums);












    }
}
