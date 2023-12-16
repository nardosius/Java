package progentis.com;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Bob S", "West Side", "dude@gmail.com", "5551234567",
                500.0));*/
        Branch branch = new Branch("West Side");
        branch.addNewCustomer(new Customer("Bob S", "West Side", "dude@gmail.com", "5551234567", 500.0));
        branch.addNewCustomer(new Customer("Anna G", "West Side", "lady@gmail.com",
                "5550987645",
                1300.0));

        /*bob.printCustomer();
        anna.printCustomer();*/

        branch.addTransaction("Bob S", new Transactions(300, new Date()));//output to separate storage structure so
        branch.addTransaction("Bob S", new Transactions(200, new Date()));//date will not change
        branch.addTransaction("Anna G", new Transactions(1200, new Date()));
        branch.addTransaction("Anna G", new Transactions(400, new Date()));

//        branch.listCustomers();
        branch.branchReport();
//        branch.transactionReport();
//        bob.updateInformation(bob, "Andy A", "North Side", "NC", "5552389991", 1700.0);


        /*ArrayList<Customer> customers = new ArrayList<>();
        customers.add(bob);
        Branch branch = new Branch("West Side", customers);
        branch.addNewCustomer(anna);
        branch.addNewCustomer(bob);
        branch.addTransaction(anna, 200.0);
        branch.addTransaction(bob, 300.0);

        bob.printCustomer();
        anna.printCustomer();*/

    }
}