package com.plurasight;

import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===================================");
        String name = getName(scanner);
        int age = getAge(scanner);
        System.out.println("====================================");
        printNameandAge(name, age);
        System.out.println("====================================");
        printVotingEligibility(age);
        System.out.println("=======================================");
        printMessage(name, age);
        System.out.println("=======================================");
        printWelcomeMessage(name);
        System.out.println("=======================================");
        printDrinkingEligibility(name, age);
        System.out.println("=======================================");
        double number = getNumber(scanner);
        double squareroot = calculateSqRoot(number);
        System.out.println("The square root of " + number + " is " + squareroot);
        System.out.println("=======================================");
        int firstNumber = getFirstNumber(scanner);
        int secondNumber = getSecondNumber(scanner);
        boolean isGreaterThan = isGreaterThan(firstNumber, secondNumber);
        System.out.println(firstNumber + " is greater than " + secondNumber + " : " + isGreaterThan);
        System.out.println("=======================================");
        String welcomeMessage = name.equalsIgnoreCase("Eve") ? "Your not welcome, " + name + " !" : "Welcome, " + name + " !";
        System.out.println(welcomeMessage);
        System.out.println("=======================================");


    }
    public static void printMessage (String name, int age){
        System.out.println("Hello, " + name + "! You are " + age + " years old");
    }
    public static String getName(Scanner scanner){
        System.out.println("What is your name?");
        return scanner.nextLine();

        //String name = scanner.nextLine(); this is a longer method that still works but is redundent
        //return name;
    }

    public static int getAge(Scanner scanner){
        System.out.println("What is your age?");
        return scanner.nextInt();
    }

    public static void printNameandAge(String name, int age){
        System.out.println(name + " is " + age + " years old");
    }

    public static void printVotingEligibility(int age){
        if (age >= 18) {
            System.out.println("You are old enough to vote");
        } else if (age < 18){
            System.out.println("You are not old enough to vote");
        }
    }

    public static void printWelcomeMessage(String name){
        if (name.equalsIgnoreCase("Alice")) {
            System.out.println("Welcome Alice!");
        } else {
            System.out.println("Hello, Stranger");

        }
    }

    public static void printDrinkingEligibility(String name, int age){
        if(name.equalsIgnoreCase("Bob") && age >= 21){
            System.out.println("Congratulations Bob! You can drink!");
        } else {
            System.out.println("You are not Bob and are not eligible to drink");
        }
    }

    public static double getNumber(Scanner scanner){
        System.out.println("Enter number:");
        return scanner.nextDouble();
    }

    public static double calculateSqRoot(double number){
        return Math.sqrt(number);

    }

    public static int getFirstNumber(Scanner scanner){
        System.out.println("Enter the first number: ");
        return scanner.nextInt();
    }

    public static int getSecondNumber(Scanner scanner) {
        System.out.println("Enter the second number: ");
        return scanner.nextInt();
    }
    public static boolean isGreaterThan(int firstNumber , int secondNumber){
        return firstNumber > secondNumber;
    }
}
