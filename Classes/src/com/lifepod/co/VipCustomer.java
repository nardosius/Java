package com.lifepod.co;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Lola Falana", 25000.00, "lola@gmail.com");
        System.out.println("Empty constructor accessed");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "default email");
        System.out.println("partial constructor accessed");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
        System.out.println("Full constructor accessed");
    }

    public String getName() {
        return this.name;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }
}
