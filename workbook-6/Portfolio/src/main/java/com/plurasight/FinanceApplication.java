package com.plurasight;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("juju", "Pam", 12500);
        BankAccount account2 = new BankAccount("ggg", "Gary", 1500);
// try to deposit money into both accounts
        account1.deposit(100);
        account2.deposit(100);

    }

}
