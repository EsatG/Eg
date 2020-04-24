package day19_Arrays;

public class Array_Practice1 {
    public static void main(String[] args) {


        String friends [] = { "Andi", "Yucel", "Omer", "Esat", "Korkut"};
      /*
        String name = classmates[3];
        System.out.println(name);

       */

        for (int i = 0; i < 5; i++){

            String name = friends[i];
            System.out.println(name);
        }

        String [] emails = {"cybertek@yahoo.com","cybertek@gmail.com", "cybertek@hotmail.com", "cybertek@outlook.com"};

        for (int i = 0; i <= 3; i++){
            String email = emails[i];
            if (email.endsWith("@gmail.com")){
                System.out.println(email);
            }
        }

    }
}
