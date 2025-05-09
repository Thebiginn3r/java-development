package com.plurasight;

public class Main {
    public static void main(String[] args) {
        Employees employees1 = new Employees("4302","Janice", "HR", 43.13, 43);
        System.out.println("Employee ID: " + employees1.getEmployeeId());
        System.out.println("Overtime: " + employees1.getOverTimeHours());
        System.out.println("========================================================================================================");

        Reservation reservation = new Reservation("king", 0.0, 3, true);
        System.out.println("Total bill: " + reservation.getReservationTotal());
        System.out.println("========================================================================================================");

        Room room = new Room(4, 170.0);
        System.out.println("Is occupied: " + room.isOccupied());
    }
}
