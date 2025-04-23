package com.plurasight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BedtimeStoriesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type goldilocks.txt for the goldilocks story");
        System.out.println("Type hansel_and_gretel.txt for the hansel and gretel story");
        System.out.println("Type mary_had_a_little_lamb.txt for the mary had a little lamb story");


        String fileName = scanner.nextLine().trim();




        try {
            FileInputStream fis = new FileInputStream(fileName);
            Scanner fileScanner = new Scanner(fis);

            int lineNumber = 1;
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(lineNumber + ". " + line);
                lineNumber++;
            }
            System.out.println("\n Thats all she wrote!");

        } catch (FileNotFoundException e){
            System.out.println("Error: The file " + fileName + " was not found.");
            System.out.println("Enter correct file name Please");
        } scanner.close();
    }
}
