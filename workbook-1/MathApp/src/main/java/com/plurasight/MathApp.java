package com.plurasight;

public class MathApp {
    public static void main(String[] args) {
        // Question 1:
// declare variables here
        double bobSalary = 105000;
        double garySalary = 120000;
        double highestSalary;

        double highestsalary = Math.max(bobSalary, garySalary);
        System.out.println("This the highest salary: " + highestsalary);

        double carPrice = 12000;
        double truckPrice = 17225;
        double cheaperChoice;

        cheaperChoice = Math.min(carPrice, truckPrice);
        System.out.println("The cheaper car: " + cheaperChoice);

        double circrad = 7.25;
        double area = Math.PI * circrad * circrad;
        System.out.println("The area of the circle is " + area);

        double tbd = 5;
        double sqRoot = Math.sqrt(tbd);
        System.out.println("The square root is: " + sqRoot);

        double x1 = 5;
        double y1 = 10;
        double x2 = 85;
        double y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between the 2 points is " + distance);

        double num = -3.8;
        double absolute = Math.abs(num);
        System.out.println("The absolute value is " + absolute);

        System.out.println("Here is your random number: " + Math.random());

    }
    
}
