package progentis.com;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer bob = new Customer("Bob S", "West Side", "dude@gmail.com", "5551234567", 500.0);
        Customer anna = new Customer("Anna G", "West Side", "lady@gmail.com",
                "5550987645",
                1300.0);
//        bob.printCustomer();
//        bob.updateInformation(bob, "Andy A", "North Side", "NC", "5552389991", 1700.0);

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(bob);
        Branch branch = new Branch("West Side", customers);
        branch.addNewCustomer(anna);
        branch.addNewCustomer(bob);
        branch.addTransaction(anna, 200.0);
        branch.addTransaction(bob, 300.0);

        bob.printCustomer();
        anna.printCustomer();

//        branch.branchReport();
    }
}