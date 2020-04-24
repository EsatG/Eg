package day07_IfStatements;

public class AgeOfVote {
    public static void main(String[] args) {

        /* write a java program that can identify if a person is eligible to vote for Donald Trump
         */
        byte age = 18;
        boolean citizen = true;
        boolean likeDonald= true;
        boolean eligible = age ==18 && citizen==true;

        if(eligible){
            System.out.println("You are eligible to vote");
        }
        if (!eligible){
            System.out.println("You are not eligible to vote");
        }


    }
}
