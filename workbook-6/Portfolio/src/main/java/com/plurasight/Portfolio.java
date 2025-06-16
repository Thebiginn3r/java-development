package com.plurasight;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private String name;
    private String owner;
    private List<IValuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }

    public void add(IValuable asset){
        assets.add(asset);
    }

    public double getValue(){
        return double;
    }

    //if u need to call 2 pair t's in a program is that where an interface comes in?

    public void getMostValuable(){

        return IValuable;
    }

    public void getLeastValuable(){
        return IValuable;
    }
}
