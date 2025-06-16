package com.plurasight;

public class Main {
    public static void main(String[] args) {
        Asset asset = new Asset("90 inch TV", 2019, 3500);
        House house = new House("5 bedroom", 2022, 250000, "123 Seasame St.", 3500, 4);

        System.out.println(house.getValue());
    }
}
