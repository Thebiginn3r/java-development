package Staticmethodpractice;

import java.util.Scanner;

public class Staticmethodpractice {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("__________________________________");
        System.out.println("Rectangle 1:");
        System.out.println("Enter the length of your rectangle: ");
        int length = myScanner.nextInt();

        System.out.println("Enter the width of your rectangle: ");
        int width = myScanner.nextInt();

        int area = length * width;
        int perimeter = 2 * area;

        System.out.println("The length is: " + length);
        System.out.println("The width is: " + width);
        System.out.println("The area is: " + area);
        System.out.println("The perimeter is: " + perimeter);

        System.out.println("__________________________________");
        System.out.println("Rectangle 2:");
        System.out.println("Enter the length of your rectangle: ");
        int length2 = myScanner.nextInt();

        System.out.println("Enter the width of your rectangle: ");
        int width2 = myScanner.nextInt();

        int area2= length2 * width2;
        int perimeter2 = 2 * area2;

        System.out.println("The length is: " + length2);
        System.out.println("The width is: " + width2);
        System.out.println("The area is: " + area2);
        System.out.println("The perimeter is: " + perimeter2);

        System.out.println("__________________________________");
        System.out.println("Rectangle 3:");
        System.out.println("Enter the length of your rectangle: ");
        int length3 = myScanner.nextInt();

        System.out.println("Enter the width of your rectangle: ");
        int width3  = myScanner.nextInt();

        int area3 = length3 * width3;
        int perimeter3  = 2 * area3;

        System.out.println("The length is: " + length3);
        System.out.println("The width is: " + width3);
        System.out.println("The area is: " + area3);
        System.out.println("The perimeter is: " + perimeter3);

        calculateRectangleInfo(length, width);

    }

    public static void calculateRectangleInfo(int length, int width){
        int area3 = length * width;
        int perimeter3  = 2 * area3;

        System.out.println("The length is: " + length);
        System.out.println("The width is: " + width);
        System.out.println("The area is: " + area3);
        System.out.println("The perimeter is: " + perimeter3);

    }
}
