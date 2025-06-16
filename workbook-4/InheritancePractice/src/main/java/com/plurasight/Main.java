package com.plurasight;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("Tony");

        Dog dog = new Dog();
        dog.setName("shoey");
        dog.setBreed("poodle");
        dog.bark();
    }
}
