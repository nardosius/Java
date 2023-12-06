package progentis.com;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers;
    private ArrayList<Double> branchTransactions;
    private String branchName;
    private ArrayList<Double> transactions;

    public Branch(String branchName, ArrayList<Customer> customers) {
        this.branchName = branchName;
        this.customers = new ArrayList<>(5000);
        this.branchTransactions = new ArrayList<>();
    }

    void addNewCustomer(Customer customer) {
        customers.add(customer);
        branchTransactions.add(customer.balance);
    }

    void removeCustomer(Customer customer) {
        customers.remove(customer);
        branchTransactions.remove(customer.balance);
    }

    void addTransaction(Customer customer, double amount) {
        customer.balance = customer.balance + amount;
        customer.transactions.add(amount);
        branchTransactions.add(customer.balance);
    }

    void branchReport(){

        for (Customer c: customers) {
            double balance = 0;
            System.out.println("-".repeat(30));
            System.out.println("Name: " + c.customerName);
            System.out.println("Branch: " + c.branchName);
            System.out.println("Email: " + c.email);
            System.out.println("Phone: " + c.phoneNumber);
            System.out.println("Balance: " + "$" + c.balance);
            System.out.println();
            System.out.println("-".repeat(30));
            System.out.println("**Customer " + c.customerName + " Transactions**");
            for (Double d : c.transactions) {
                System.out.println("Transaction: " + "$"+ d);
                balance += d;
            }
            System.out.println("Total balance: " + "$" + balance);
        }
    }
}
