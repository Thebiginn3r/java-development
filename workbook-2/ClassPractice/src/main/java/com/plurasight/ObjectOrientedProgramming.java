package com.plurasight;

public class ObjectOrientedProgramming {
    public static void main(String[] args) {
        Person firstPerson = new Person(55, "Tony");
        Person secondPerson = new Person(25, "Johnny");

        System.out.println(firstPerson.getName());

        firstPerson.setName("RayPotatoe");

        System.out.println(firstPerson.getName());

        //String studentName = "Ray";
    }


}
