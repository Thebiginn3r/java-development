package com.plurasight;

import org.w3c.dom.ls.LSOutput;

public class ArrayPracticeFile {
    public static void main(String[] args) {
     /*   int i = 0;

        while(i<10){
            System.out.println(i);
            i++;
        }*/

        /*System.out.println("==================================");

        for (int i = 0; i < 10; i++){
            System.out.println(i);

        }*/

        /*int sum = 0;
        int i = 0;
        while(1 <= 10) {
            sum += i;
            i++;
        }*/

        /*do {
            sum += 1;
            i++;
        } while (1 <= 10);

        System.out.println(sum);*/

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                continue;
            }
            sum += 1;


        }

        System.out.println();

    }
}
