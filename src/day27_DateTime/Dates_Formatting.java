package day27_DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {


    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM/dd/yy");  // this method eventually return as a string
        // for year two patterns =>> yy, yyyy    for month =>>  MM,MMM,MMMM   for days =>> dd

        LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(dtf));

        /*
        create a date called birthday: month/days/year
         */

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EE MMM/dd/yy");
        LocalDate date2 = LocalDate.of(1999,12,25);
        String str1 = date2.format(dtf2);
        System.out.println(str1);

        // for print out the name of days =>> E or EE or EEE (three letters of the day), EEEE (Entire name of the day)

        LocalDate date3 = LocalDate.now();
        System.out.println(date3.format(dtf2));



}
    }