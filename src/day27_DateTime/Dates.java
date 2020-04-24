package day27_DateTime;

import java.time.LocalDate;

public class Dates {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2020,10,25);

        System.out.println(date1);


        LocalDate birthday = LocalDate.of(1981,10,2);
        System.out.println(birthday);

        // isAfter(date2)  for comparing one date to another and it returns as boolean

        boolean result1 = date1.isAfter(birthday);
        System.out.println(result1);

        // isBefore(date2)  for comparing one date to another and it returns as boolean

        boolean result2 = date1.isBefore(birthday);
        System.out.println(result2);

        // isEqual(date2)
        boolean result3 = date1.isEqual(birthday);
        System.out.println(result3);

        // isLeapyear();   if february is 29 in this year  it is leap year

        boolean result4 = date1.isLeapYear();
        System.out.println(result4);

        System.out.println("=======================================================================");

        LocalDate now = LocalDate.now();   // it gives us today's date   2020-04-23
        System.out.println("Today is: " + now);

        String str = now.toString();
        System.out.println(str.replace("-"," "));
        System.out.println("========================================================================");

        LocalDate birthDay_OCevdet = LocalDate.of(2011,10,27);
        int month = birthDay_OCevdet.getMonthValue();
        int days = birthDay_OCevdet.getDayOfMonth();
        System.out.println(month);
        System.out.println("=========================================================================");

        // month/day/year   this is the pattern





    }
}
