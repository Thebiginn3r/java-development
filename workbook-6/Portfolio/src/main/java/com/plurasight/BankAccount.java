package com.plurasight;

public class BankAccount implements IValuable{
    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdraw(double amount){

    }

    public void deposit(double amount){
        System.out.println("Your deposit was successful");
    }

    @Override
    public double getValue() {
        return 0;
    }
}
