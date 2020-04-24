package day28_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime_Formatting {
    public static void main(String[] args) {

        LocalDateTime dateTime1 = LocalDateTime.of(2015,12,25,23,30,45);
        System.out.println(dateTime1);

        // required format is   Fri, 12/25/2015  11:30:45 PM
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE, MM/dd/yyyy hh:mm:ss a");
        System.out.println(dateTime1.format(dtf));


    }
}
