package com.plurasight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double smls = 5.45;
        double lrgs = 8.95;
        double total;

        System.out.println("A small sandwich is $5.45 and a large sandwich is $8.95");
        System.out.println("What size sandwich would you like? (Enter: sml/lrg)");
        String size = scanner.nextLine();

        System.out.println("What is your age?");
        int age = scanner.nextInt();


        if (age <= 17 && size.equals("sml")) {
            total = smls * .9;
            System.out.printf("Your total is $%.2f with your kids discount", total);
        } else if (age <= 17 && size.equals("lrg")) {
            total = lrgs * .9;
            System.out.printf("Your total is $%.2f with your kids discount", total);
        } else if (age >= 65 && size.equals("sml")){
            total = smls * .8;
            System.out.printf("Your total is $%.2f with your seniors discount", total);
        } else if (age >= 65 && size.equals("lrg")) {
            total = lrgs * .8;
            System.out.printf("Your total is $%.2f with your seniors discount", total);
        } else if (age > 17){


        }


    }
}
