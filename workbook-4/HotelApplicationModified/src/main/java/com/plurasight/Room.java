package com.plurasight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(boolean numberOfBeds, boolean price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public boolean getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }

    public void ischeckIn(boolean occupiedIs){
        if (!isOccupied && !isDirty){
            isOccupied = true;
            isDirty = true;
        }
    }

    public void checkOut(){
        isOccupied = false;
    }

    public void cleanRoom(){
        if (!isOccupied){
            isDirty = false;
        }
    }
}
