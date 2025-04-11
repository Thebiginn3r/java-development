package com.plurasight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String name = myScanner.nextLine();

        System.out.println("Enter Your hours worked: ");
        float hoursWorked = myScanner.nextInt();

        System.out.println("Enter your hourly wage: ");
        float wage = myScanner.nextInt();
        float grosspay = hoursWorked * wage;
        System.out.println(name + " worked " + hoursWorked + ". Their pay is " + grosspay);

    }
}
