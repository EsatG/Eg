package day54_Maps;

public class String_VS_Buffer_VS_Builder {

    public static void main(String[] args) {

        String str1 = "cybertek";
        str1.concat(" School"); //  new String object was created

        System.out.println(str1); // cybertek => String object can not be modified. it is immutable

        StringBuilder builder = new StringBuilder("Cybertek");
        builder.append("School");

        System.out.println(builder);   // Cybertek School=>  StringBuilder object can be modified since it is mutable

        System.out.println("==========================================================================");

        StringBuffer buffer = new StringBuffer("Cybertek");
        buffer.append(" School");
        System.out.println(buffer); // Cybertek School=>  StringBuilder object can be modified since it is mutable

        System.out.println("=============================================================================");

        String word = "ABCD";

        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        System.out.println(sb); // DCBA
        System.out.println(word); // ABCD

        word = sb.toString();
        System.out.println(word); // DCBA


    }
}
