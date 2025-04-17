package com.plurasight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* System.out.print("First name: ");
        String firstName = scanner.nextLine().trim();
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine().trim();*/
        System.out.println("Enter your first and last name:");
        String fullName = scanner.nextLine();
        int indexOfSpace = fullName.indexOf(" ");
        String firstName = fullName.substring(0, indexOfSpace);
        String lastName = fullName.substring(indexOfSpace + 1);

        System.out.println("What date will you be coming? (mm/dd/yyy):");
        String dateInput = scanner.nextLine();
        System.out.println("Enter how many tickets would you like:");
        int ticketAmount = Integer.parseInt(scanner.nextLine());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate userDate = LocalDate.parse(dateInput, formatter);

        if (ticketAmount == 1){
            System.out.println("1 ticket reserved for " + userDate + " under " + lastName + ", " + firstName);
        } else {
            System.out.println(ticketAmount + " tickets reserved for " + userDate + " under " + lastName + ", " + firstName);
        }

    }
   // public static void date
}
