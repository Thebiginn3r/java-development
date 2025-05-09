package com.plurasight;

import java.util.ArrayList;
import java.util.List;

public class ArrayndHashmapappPractice {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "Raymound";
        names[1] = "Adam";

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);


        List<String> kids = new ArrayList<>();
        kids.add("Natalie");
        kids.add("Brittany");
        kids.add("Zachary");

        for (int i = 0; i < kids.size(); i++) {
            System.out.println((i+1) + " : " + kids.get(i));
        }
        //kids.remove(1);

        System.out.println("=========================");

        kids.set(2, "Zach");

        for (int i = 0; i < kids.size(); i++) {
            System.out.println((i + 1) + " : " + kids.get(i));
        }

    }
}
