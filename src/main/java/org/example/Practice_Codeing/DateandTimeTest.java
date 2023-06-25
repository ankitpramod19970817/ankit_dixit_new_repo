package org.example.Practice_Codeing;
/* use of date ad timeapi in java 8*/

import java.time.LocalDate;

public class DateandTimeTest {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        int dd= date.getDayOfMonth();
        int mm=date.getDayOfYear();
        int yy=date.getYear();
        System.out.printf("%d-%d-%d",dd,dd,yy);

    }
}
