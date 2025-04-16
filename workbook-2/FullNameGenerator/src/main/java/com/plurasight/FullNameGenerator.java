package com.plurasight;

import java.util.Scanner;

public class FullNameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        System.out.print("First name: ");
        String firstName = scanner.nextLine().trim();
        System.out.print("Enter your middle name: ");
        String middleName = scanner.nextLine().trim();
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine().trim();
        System.out.print("Enter your suffix: ");
        String suffix = scanner.nextLine().trim();

        String fullname = firstName;

        if(firstName.isEmpty() || lastName.isEmpty()) {
            System.out.println("You need a first name and last name");
        } else if (!middleName.isEmpty()){
            fullname = fullname + " " + middleName.charAt(0);
        } else  if (!lastName.isEmpty()) {
            fullname = fullname + " " + lastName;
        } else if (!suffix.isEmpty()) {
            fullname = fullname + ", " + suffix;
        }
        System.out.println(fullname);

        /*else if (lastName.isEmpty()){
                System.out.println("You need a last name");
        } else if (middleName.isEmpty()){
            System.out.println(firstName + " " + lastName);
        } else if (suffix.isEmpty()){
            System.out.println(firstName + " " + middleName + " " + lastName);
        } else if (middleName.isEmpty() && suffix.equals("")){
        else {
            System.out.println(firstName + " " + middleName + " " + lastName + ", " + suffix);
        }*/
        }
    }

