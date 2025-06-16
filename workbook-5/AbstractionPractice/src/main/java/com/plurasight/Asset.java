package com.plurasight;

public class Asset {
    protected String desription;
    protected int yearAcquired;
    protected double originalCost;

    public Asset(String desription, int yearAcquired, double originalCost) {
        this.desription = desription;
        this.yearAcquired = yearAcquired;
        this.originalCost = originalCost;
    }

    public String getDesription() {
        return desription;
    }

    public int getYearAcquired() {
        return yearAcquired;
    }

    public double getOriginalCost() {
        return originalCost;
    }

    public double getValue(){
        return originalCost;
    }
}
