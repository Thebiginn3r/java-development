package com.plurasight;

import java.util.Scanner;

public class VehicleInventory {

    private static Vehicle[] vehicles = new Vehicle[20];

    private static int numOfVehicles = 6;

    public static void main(String[] args) {
        vehicles[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500.00f);
        vehicles[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000.00f);
        vehicles[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700.00f);
        vehicles[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500.00f);
        vehicles[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500.00f);
        vehicles[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000.00f);

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("What do you want to do?");
            System.out.println(" 1 - List all vehicles");
            System.out.println(" 2 - Search by make/model");
            System.out.println(" 3 - Search by price range");
            System.out.println(" 4 - Search by color");
            System.out.println(" 5 - Add a vehicle");
            System.out.println(" 6 - Quit");
            System.out.println("Enter your command: ");

            int command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
                case 1:
                    //list all vehicles
                    listallVehicles();
                    break;
                case 2:
                    //search by make and model
                    break;

            }
        }
    }



    private static void listallVehicles() {
        System.out.println("Vehicle Inventory");

        for (int i = 0; i < numOfVehicles; i++) {
            System.out.println(vehicles[i]);
        }
    }

    private static void findVehiclesByMakeModel(Scanner scanner ) {
            System.out.println("Enter make and model: ");
            String makeModel = scanner.nextLine();

            for (int i = 0; i < numOfVehicles; i++) {

            }
        }

}
