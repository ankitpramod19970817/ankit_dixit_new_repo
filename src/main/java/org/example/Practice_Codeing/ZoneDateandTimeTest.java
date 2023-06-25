package org.example.Practice_Codeing;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateandTimeTest {
    public static void main(String[] args) {
        ZoneId la=ZoneId.of("America/Los_Angeles");
        ZonedDateTime zonedDateTime=ZonedDateTime.now();
        System.out.println(zonedDateTime);
    }
}
