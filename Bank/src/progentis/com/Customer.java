package progentis.com;

import java.util.ArrayList;

public class Customer {
    String customerName;
    String branchName;
    String email;
    String phoneNumber;
    double balance;
    ArrayList<Double> transactions;

    public Customer(String customerName, String branchName, String email, String phoneNumber, double balance) {
        this.customerName = customerName;
        this.branchName = branchName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
        this.transactions = new ArrayList<>(5000);
        transactions.add(balance);
    }

    Customer updateInformation(Customer customer, String updateName,
                               String updateBranch,
                               String updateEmail,
                               String updatePhone,
                               double updateBalance) {
        if (customer != null) {
            addUpdateInformation(customer, updateName, updateBranch, updateEmail,
                    updatePhone, updateBalance);
        } else {
            System.out.println("Customer not found. Account cannot be updated.");
        }
        return customer;
    }
     Customer addUpdateInformation(Customer customer,
                                          String updateName,
                                          String updateBranch,
                                          String updateEmail,
                                          String updatePhone,
                                          double updateBalance) {
            if (updateName.equalsIgnoreCase("NC")) {
                updateName = customer.customerName;
            } customer.customerName = updateName;
            if (updateBranch.equalsIgnoreCase("NC")) {
                updateBranch = customer.branchName;
            } customer.branchName = updateBranch;
            if (updateEmail.equalsIgnoreCase("NC")) {
            updateEmail = customer.email;
            } customer.email = updateEmail;
            if (updatePhone.equalsIgnoreCase("NC")) {
            updatePhone = customer.phoneNumber;
            } customer.phoneNumber = updatePhone;
            if (updateBalance == customer.balance) {
            updateBalance = customer.balance;
            } customer.balance = updateBalance;
            return customer;
    }

    public void printCustomer(){
        double totalBalance = 0;
        System.out.println("-".repeat(30));
        System.out.println("Name: " + customerName);
        System.out.println("Branch: " + branchName);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Balance: " + "$"+ balance);
        System.out.println();
        System.out.println("-".repeat(30));
        System.out.println("**Customer " + customerName + " Transactions**");
        for (Double d : transactions) {
            System.out.println("Transactions: " + "$" + d);
            totalBalance += d;
        }
        System.out.println("Total balance: " + "$" + totalBalance);
    }

}
