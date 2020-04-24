package day09_NestedIf_Ternary;

public class NestedIf {
    public static void main(String[] args) {

        int age = 16;
        boolean USCitizen = true;
        if(USCitizen) {
            if (age > 17) {
                System.out.println("You are eligible to vote");
            } else {
                System.out.println("You need to grow up");
            }
        }
        else {
                System.out.println("Only the US citizens are eligible to vote");
            }
        System.out.println("===========================================================================");
        int score = 85;
        String grade ="";
        if(score >= 0 && score <= 100){
            if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70){
                grade="C";
            } else if (score >= 60){
                grade="D";
            } else if (score >=0){
                grade="F";
            }
        }
              else {
                  grade="invalid";
        }
        System.out.println(grade);

              int score2 = 75;
              String grade2 = "";

              if (score >= 0 && score <= 100){
                  grade2 = (score2 >= 90) ? "A" : (score2 >= 80) ? "B" : (score2 >= 70) ? "C" : (score2 >= 60) ? "D" : "F";
              }  else {
                  grade2 = "Invalid";
              }
        System.out.println(grade2);
        System.out.println("=========================================================================================");








        }





    }





