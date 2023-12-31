

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

record BranchTransactions (String customerName, double balance, double amount, Date date) {}

public class Branch {
    private ArrayList<Customer> customers;
    private List<BranchTransactions> branchTransactions;
    private List<BranchTransactions> archive;
    private String branchName;
    private ArrayList<Double> transactions;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<>(5000);
        this.branchTransactions = new ArrayList<>();
        this.archive = new ArrayList<>();
    }

     String getBranchName() {
        return this.branchName;
    }

    void getCustomer() {
        for (Customer c : customers) {
            System.out.println(c.customerName);
        }
    }
    void addNewCustomer(Customer customer) {
        for (Customer c : customers) {
            if (c.equals(customer)) {
                System.out.println("Found a match: " + c.customerName);;
            }
        }
        double amount = customer.balance;
        Date date = new Date();
        customers.add(customer);
        branchTransactions.add(new BranchTransactions(customer.customerName, customer.balance, amount, date));
        storeTransactions(branchTransactions);
        }

    void storeTransactions(List<BranchTransactions> transactions) {
        archive.addAll(transactions);
    }
    void listCustomers() {
        for (var c : customers) {
            System.out.println("-".repeat(30));
            System.out.println("Name: " + c.customerName);
            System.out.println("Branch: " + c.branchName);
            System.out.println("Email: " + c.email);
            System.out.println("Phone: " + c.phoneNumber);
            System.out.println("Balance: " + "$" + c.balance);
            System.out.println();
        }
    }

    /*void removeCustomer(Customer customer) {
        customers.remove(customer);
        branchTransactions.remove(customer.customerName, customer.balance, );
    } need to remove customer from permanent storage, not transactions*/

    void addTransaction(String name, Transactions money) {
        for (var c : customers) {
            if (name.equalsIgnoreCase(c.customerName)) {
                c.transactions.add(money);
                c.balance = c.balance + money.balance();
                branchTransactions.add(new BranchTransactions(c.customerName, c.balance, money.balance(), money.date()));
                storeTransactions(branchTransactions);
            }
        }
    }

    void branchReport(){
        Date date = new Date();
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
            for (Transactions t : c.transactions) {
                System.out.println("Transaction: " + "$"+ t.balance() + "--" + t.date());
                balance += t.balance();
            }
            System.out.println("Total balance: " + "$" + balance);
        }
    }

    void transactionReport() {
        for (BranchTransactions b : archive) {
            System.out.println();
            System.out.println("-".repeat(30));
            System.out.println("Customer Name: " + b.customerName());
            System.out.println("Transaction: " + b.amount());
            System.out.println("Customer Balance: " + b.balance());
            System.out.println("Last Account Update: " + b.date());

        }
    }

}
