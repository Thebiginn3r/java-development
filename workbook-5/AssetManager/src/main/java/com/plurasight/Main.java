package com.plurasight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList asset = new ArrayList<>();
        House house1 = new House("ggg","11/10/98", 79000.00, "123 Sesame St.", 3, 3400, 3);
        asset.add(house1);

        System.out.println(house1);
    }
}
