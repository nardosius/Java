import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions, double balance){

    public Customer(String name, double initialDeposit, double balance) {
        this(name.toUpperCase(), new ArrayList<>(500), balance);
        transactions.add(initialDeposit);

    }

}

public class Main {
    public static void main(String[] args) {
//        Customer bob = new Customer("Bob S", 1000.0);
//        System.out.println(bob);

        Bank bank = new Bank("Chase");
        bank.addNewCustomer("Bob S", 100.0);
        bank.addNewCustomer("Jane A", 500.0);
        System.out.println(bank);

        bank.addTransaction("Bob S", 25.0);
        bank.addTransaction("bob s", 1000.0);
        bank.addTransaction("bob s", -243.0);
        bank.printStatement("Bob S");

        bank.addTransaction("Jane A", -10.25);
        bank.addTransaction("Jane A", -75.01);
        bank.addTransaction("jane a", 1368.0);
        bank.printStatement("Jane A");
    }
}