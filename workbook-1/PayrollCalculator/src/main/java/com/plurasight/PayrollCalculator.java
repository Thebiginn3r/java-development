package com.plurasight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String name = myScanner.nextLine();

        System.out.println("Enter Your hours worked: ");
        float hoursWorked = myScanner.nextFloat();

        System.out.println("Enter your hourly wage: ");
        float wage = myScanner.nextFloat();
        double wage2 = wage * 1.5;
        float grosspay = hoursWorked * wage;
        double grosspay2 = (40 * wage) + ((hoursWorked - 40)* wage2);
        if (hoursWorked > 40) {
            System.out.println(name + " worked " + hoursWorked + ". Their pay is " + grosspay2);
        } else {
            System.out.println(name + " worked " + hoursWorked + ". Their pay is " + grosspay);
        }



    }
}
