package com.plurasight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class DatePractice {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today is: " + today);
        System.out.println("Day of the week: " + today.getDayOfWeek());
        System.out.println("Day of the Month: " + today.getDayOfMonth());
        System.out.println("Day of the Year: " + today.getDayOfYear());
        System.out.println("Month name: " + today.getMonth());
        System.out.println("Month of the year: " + today.getMonthValue());
        System.out.println("Year" + today.getYear());

        System.out.println("======================");

        LocalTime currentTime = LocalTime.now();
        System.out.println("The current Time is: " + currentTime);
        System.out.println("Hour: " + currentTime.getHour());
        System.out.println("Minute: " + currentTime.getMinute());
        System.out.println("Second:  " + currentTime.getSecond());
        System.out.println("Nanosecond:  " + currentTime.getNano());


        System.out.println("======================");

        LocalDateTime rightNow = LocalDateTime.now();
        System.out.println("Right now, it is: " + rightNow);

        System.out.println("======================");

        String userInput = "10/17/2022";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate newDate = LocalDate.parse(userInput, dateTimeFormatter);
        System.out.println(newDate);

        System.out.println("======================");

        LocalDateTime currentDate = LocalDateTime.now();
        System.out.println("Today is: " + currentDate);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, MMM, dd, yyyy HH:mm:ss");
        String formattedDate = currentDate.format(formatter);
        System.out.println("Today is: " + formattedDate);
    }
}
