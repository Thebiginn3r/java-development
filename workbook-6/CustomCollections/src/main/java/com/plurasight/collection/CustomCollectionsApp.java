package com.plurasight.collection;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CustomCollectionsApp {
    public static void main(String[] args) {
        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(10);
        numbers.add(3);
        numbers.add(92);
        numbers.add(43); // this line should fail
        System.out.println(numbers.getItems().size());
        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
        LocalDateTime dateTime = LocalDateTime.now();


        System.out.println(dateTime.getHour());
        LocalDate date = LocalDate.now();

        System.out.println(date.getDayOfMonth());
        //dates.add(15); // this line should fail
    }
}
