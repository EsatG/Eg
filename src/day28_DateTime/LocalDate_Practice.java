package day28_DateTime;

import java.time.LocalDate;

public class LocalDate_Practice {
    /*
    1. create an array of string, store five of your friends names in it
	2. create Array of localdates and store thier birthdays in the same order
	3. use for loop to print out your friends' names and thier birthdays
     */

    public static void main(String[] args) {

        String[] friends = {"Andi", "Bahri", "Halil"};

        LocalDate AndiBirthday = LocalDate.of(1988,4,25);
        LocalDate BahriBirthday = LocalDate.of(1985,5,1);
        LocalDate HalilBirthday = LocalDate.of(1988,11,15);

        LocalDate [] birthdays = {AndiBirthday,BahriBirthday,HalilBirthday};

        for (int i = 0; i < friends.length; i++){    // we can use both friends' or birthdays' length it does not matter
            String name = friends[i];
            LocalDate birthd = birthdays[i];
            System.out.println(name + "'s birthday is " + birthd);
        }

    }
}
