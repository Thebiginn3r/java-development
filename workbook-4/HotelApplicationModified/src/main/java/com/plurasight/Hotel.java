package com.plurasight;

public class Hotel {
    private int bookedsuites = 0;
    private int bookedBasicRooms = 0;
    private String name;
    private int numberOfRooms;
    private int numberOfSuites;

    public Hotel(String name, int bookedsuites, int bookedBasicRooms) {
        this.bookedsuites = bookedsuites;
        this.bookedBasicRooms = bookedBasicRooms;
        this.name = name;
        this.numberOfRooms = 0;
        this.numberOfSuites = 0;
    }

    public Hotel(int bookedsuites, int bookedBasicRooms, String name, int numberOfRooms, int numberOfSuites) {
        this.bookedsuites = bookedsuites;
        this.bookedBasicRooms = bookedBasicRooms;
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        this.numberOfSuites = numberOfSuites;
    }

    public int getBookedsuites() {
        return bookedsuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getAvailableSuites(){
        return numberOfRooms - bookedBasicRooms;
    }

    /*public boolean bookRoom(int numberOfRooms, boolean isSuite){
        if(numberOfRooms <= 0) {
            return false;
        }

        if (isSuite){
            if (getAvailableSuites())
        }

        }*/
}




