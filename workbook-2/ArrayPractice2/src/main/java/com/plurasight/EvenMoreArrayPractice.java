package com.plurasight;

public class EvenMoreArrayPractice {
    public static void main(String[] args) {
        int[] nums = {63,65,60,53,58,37,35,31};
        displayNumbers(nums);
    }

    public static void displayNumbers(int[] listOfNumbers){
        for (int i = 0; i < listOfNumbers.length; i++) {
            System.out.println(listOfNumbers[i] + " ");
        }
        System.out.println();
    }
}
