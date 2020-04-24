package day28_DateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time_Formatting {
    public static void main(String[] args) {

        // hours : hh   minutes : mm  seconds: ss  am/pm : a

        LocalTime time1 = LocalTime.of(12,30);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm a");

        System.out.println(time1.format(dtf));

        LocalTime time2 = LocalTime.of(0,15);
        System.out.println(time2.format(dtf));

        boolean result = time1.isAfter(time2);
        System.out.println(result);

    }
}
