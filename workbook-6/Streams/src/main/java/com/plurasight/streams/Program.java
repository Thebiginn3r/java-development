package com.plurasight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        people.add(new Person("Sally", "Gibbons", 10));
        people.add(new Person("Hayley", "Ellis",29));
        people.add(new Person("Faye","Atkins", 49));
        people.add(new Person("Jessie","Manning", 38));
        people.add(new Person("Maisey", "Kirk", 25));
        people.add(new Person("Laura", "Levy", 27));
        people.add(new Person("Iris","Cotton", 59));
        people.add(new Person("Elif","Campos",48));
        people.add(new Person("Axel","Navarro",23));
        people.add(new Person("Evangeline","Castaneda", 35));

        System.out.print("Would you like to search people by first or last name?(first/last): ");
        String choice = scanner.nextLine();
        System.out.print("Enter name you would like to search: ");
        String nameSearch = scanner.nextLine();

        boolean found = false;

        switch(choice) {
            case "first":
                for (Person p : people) {
                    if (nameSearch.equalsIgnoreCase(p.getFirstName())) {
                        System.out.println("Found: " + p.getFirstName() + " " + p.getLastName() + ", Age: " + p.getAge());
                        found = true;
                    }
                }
                break;

            case "last":
                for (Person p : people) {
                    if (nameSearch.equalsIgnoreCase(p.getLastName())) {
                        System.out.println("Found: " + p.getFirstName() + " " + p.getLastName() + ", Age: " + p.getAge());
                        found = true;
                    }
                }
                break;

            default:
                System.out.println("Invalid choice. Try again");
                return;
        }
        if(!found){
            System.out.println("Name not found");
        }

    }
}
