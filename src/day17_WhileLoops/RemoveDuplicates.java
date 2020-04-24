package day17_WhileLoops;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "Java is fun, Java is cool, Java is a prog";

        int count = 0;  //  2

        while (str.contains("a")) {
            count++;
            str = str.replaceFirst("a","");  // after counting the first "a" we need to remove it from str

        }
        System.out.println(count);








    }
}
