package com.plurasight;

public class House extends Asset {
    private String address;
    private int squareft;
    private int lotSize;

    public House(String desription, int yearAcquired, double originalCost, String address, int squareft, int lotSize) {
        super(desription, yearAcquired, originalCost);
        this.address = address;
        this.squareft = squareft;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public int getSquareft() {
        return squareft;
    }

    public int getLotSize() {
        return lotSize;
    }
    public double getValue(){
        return (180 + squareft) + (.25 * lotSize);
    }
}
