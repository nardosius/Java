package com.lifepod.co;

import java.util.SplittableRandom;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("56789", 2.5, "default name", "default email", "default phone");
        System.out.println("Empty constructor called");
    }//can set up default values in otherwise empty constructor

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called");
            this.accountNumber = accountNumber;
            this.balance = balance;
            this.customerName = customerName;
            this.email = email;
            this.phoneNumber = phoneNumber;
    }//can use constructor to initialize arguments in Main w/o setters

    public void deposit(double amount) {
        if (amount < 1) {
            System.out.println("Deposit amount invalid");
        }else {
            this.balance = getBalance() + amount;
            System.out.println("$" + amount + " was deposited. New balance is " + this.balance);
        }
    }

    public void withdrawal(double amount) {
        if (amount > getBalance()){
            System.out.println("Insufficient balance for withdrawal amount.");
        }else {
        this.balance = getBalance() - amount;
            System.out.println("$" + amount + " was withdrawn. New balance is " + this.balance);
        }
    }



    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
