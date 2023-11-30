import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);


    public Bank(String name) {
        this.name =  name;
    }

    private Customer getCustomer(String customerName) {
        for (var c : customers) {
            if (customerName.equalsIgnoreCase(c.name())) {
                return c;
            }
        }
        System.out.printf("Customer (%s) wasn't found %n", customerName);
        return null;
    }

    public void addNewCustomer(String customerName, double initialDeposit) {
        double balance = initialDeposit;
        if (getCustomer(customerName) == null){
            Customer customer = new Customer(customerName, initialDeposit, balance);
            customers.add(customer);
            System.out.println("New customer added: " + customer + " " +
                    "with initial deposit of " + balance);
        }
    }

    public double addTransaction(String name, double transactionAmount) {
        Customer customer = getCustomer(name);//access private method
        if (customer != null) {
            customer.transactions().add(transactionAmount);
            double balance = transactionAmount + customer.balance();
        }
        return customer.balance();
    }

    public void printStatement(String customerName) {

        double total = 0;
        Customer customer = getCustomer(customerName);//access private method
        if (customer == null) {
            return;
        }
        System.out.println("-".repeat(30));
        System.out.println("Customer name: " + customer.name());
        System.out.println("Transactions: ");
        for (double d : customer.transactions()) {//unboxing
            System.out.printf("$%10.2f (%s)%n", d, d < 0 ? "debit" : "credit");
            total += d;
        }
        System.out.println("Balance: " + total);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }
}
