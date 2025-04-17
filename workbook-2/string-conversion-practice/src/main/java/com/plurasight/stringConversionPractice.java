package com.plurasight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class stringConversionPractice {
    public static void main(String[] args) {
       /* String stringNumber = "111";
        int fixedNumber = Integer.parseInt(stringNumber);
        int result = fixedNumber + 1;

        System.out.println(stringNumber + 1);
        System.out.println(result);*/
        Scanner scanner = new Scanner(System.in);
        String userInput = "2002-10-17";
        String userInput2 = "10/17/2002";
        LocalDate birthday = LocalDate.parse(userInput);
        System.out.println(birthday);
        System.out.println("============================");

        System.out.println("Please enter the date you want as mm/dd/yyyy");
        String dateInputFromUser = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yy");

        LocalDate userDate = LocalDate.parse(dateInputFromUser, formatter);

        System.out.println(userDate);

    }
}
