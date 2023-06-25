package org.example.Practice_Codeing;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DateTimeTest2 {
    public static void main(String[] args) {
        LocalDateTime localDate=LocalDateTime.of(1995,Month.APRIL,26,20,22);
        System.out.println(localDate.plusMonths(11));
        System.out.println(localDate.minusMonths(11));

    }
}
