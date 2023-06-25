package org.example.Practice_Codeing;

import java.time.LocalDate;
import java.time.Period;

public class SteamsTest5 {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.now();
        LocalDate localDate1=LocalDate.of(1997,8,17);
        Period p=Period.between(localDate1,localDate);
        System.out.printf("%d-%d-%d",p.getYears(),p.getMonths(),p.getDays());
    }
}
