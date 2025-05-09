package com.plurasight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class FormatDatesApplication {
    public static void main(String[] args) {
        LocalDateTime currentDate = LocalDateTime.now();
        TimeZone timeZone = TimeZone.getTimeZone("US/Eastern");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-dd-dd");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("E, MMM, dd, yyyy HH:mm");

        String formattedDate = currentDate.format(formatter);
        String formattedDate2 = currentDate.format(formatter2);
        String formattedDate3 = currentDate.format(formatter3);
        String formattedDate4 = currentDate.format(formatter4);

        System.out.println(formattedDate);
        System.out.println(formattedDate2);
        System.out.println(formattedDate3);
        System.out.println(formattedDate4);


    }
}
