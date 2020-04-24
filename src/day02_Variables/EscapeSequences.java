package day02_Variables;

public class EscapeSequences {

    public static void main(String[] args) {

        System.out.println("\t\t\t\t\t\tEsat"); // t means a paragraph space
        System.out.println("Esat");
        System.out.println("Cybertek School");
        System.out.println("Cybertek \nSchool"); //n means new line, starts with new line
        System.out.println("\n\n\nMy\nname\nis\nEsat");

        // print: My favourite TV show is "Game of Thrones"

        System.out.println("My favourite TV show is \"Game of Thrones\"");
        System.out.println("My favourite book is \'Sefiller\''");

        System.out.println("\\"); //  \\ prints single slash (\)
        System.out.println("/");

        System.out.println("My favourite team is \'Fenerbahce\'"); //  \' prints the single quote (')
        System.out.println("My favourite team is'Fenerbahce'");

        System.out.println("I love \"Java\"");

        System.out.println("\tI am learning \"Java\"");
        System.out.println("\nI am learning Java");
        System.out.println("\nHow are you ?");

        System.out.print("Esat");
        System.out.print(" Gorgun");




    }
}
