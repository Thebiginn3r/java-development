package com.plurasight;

import java.util.Scanner;

public class Dayoftheweekswitchcasepractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the day that you want (0-6):");
        int dayNumber = scanner.nextInt();

        String dayName = "";

       /* if (dayNumber == 0){
            dayName = "Sunday";
        } else if (dayNumber == 1){
            dayName = "Monday";
        }else if (dayNumber == 2){
            dayName = "Tuesday";
        }else if (dayNumber == 3){
            dayName = "Wednesday";
        }else if (dayNumber == 4){
            dayName = "Thursday";
        }else if (dayNumber == 5){
            dayName = "Friday";
        }else if (dayNumber == 6){
            dayName = "Saturday";
        }else {
            System.out.println("Wrong input try again");
            return;
        }*/

        // The following code does the same thing as if statements but is far more efficient

        switch (dayNumber){
            case 0:
                dayName = "Sunday";
                break;
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            default:
                System.out.println("wrong input try again");
                return;
        }

        System.out.println("The name of the day is " + dayName);
    }
}
