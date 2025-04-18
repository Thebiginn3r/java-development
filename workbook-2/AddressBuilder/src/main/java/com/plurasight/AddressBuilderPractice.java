package com.plurasight;

import java.util.Scanner;

public class AddressBuilderPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the following information");
        System.out.print("Full Name: ");
        String fullName = scanner.nextLine();
        System.out.println();

        System.out.println("Billing Street: ");
        String address = scanner.nextLine();
        System.out.print("Billing City: ");
        String city = scanner.nextLine();
        System.out.print("Billing State: ");
        String state = scanner.nextLine();
        System.out.print("Billing Zip: ");
        String zip = scanner.nextLine();
        System.out.println();

        System.out.print("Shipping Street: ");
        String shaddress = scanner.nextLine();
        System.out.print("Shipping city: ");
        String shcity = scanner.nextLine();
        System.out.print("Shipping state: ");
        String shstate = scanner.nextLine();
        System.out.print("Shipping Zip: ");
        String shzip = scanner.nextLine();

        StringBuilder addressBuilder = new StringBuilder();
        addressBuilder.append(fullName);
        addressBuilder.append("\n\n");
        System.out.println("Billing Address:\n");
        addressBuilder.append(address + "\n");
        addressBuilder.append(city + ", " + state + " " + zip).append("\n\n");

        System.out.println("Shipping Address:\n");
        addressBuilder.append(shaddress + "\n");
        addressBuilder.append(shcity + ", " + shstate + " " + shzip).append("\n\n");

        String addressBuilderString = addressBuilder.toString();
        System.out.println(addressBuilderString);


    }
}
