package com.plurasight;

public class Reservation {
    private String roomType;
    private Double price;
    private int nuberOfNights;
    private boolean weekend;

    public Reservation(String roomType, Double price, int nuberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.price = price;
        this.nuberOfNights = nuberOfNights;
        this.weekend = weekend;
        if (roomType.equals("king")) {
            this.price = 139.00;
        } else if (roomType.equals("full")){
            this.price = 124.00;
        }
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public double getReservationTotal() {
        double totalPrice = price * nuberOfNights;
        if (weekend){
            totalPrice *= 1.1;
        }
        return totalPrice;
    }

    public int getNuberOfNights() {
        return nuberOfNights;
    }

    public void setNuberOfNights(int nuberOfNights) {
        this.nuberOfNights = nuberOfNights;
    }
}
