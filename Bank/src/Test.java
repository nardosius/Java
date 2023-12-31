package progentis.com;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

record Monies(double balance, Date date) {

}
public class Test {
    String customerName;
    String branchName;
    String email;
    String phoneNumber;
    double balance;
    List<Monies> transactions;//create a transaction record that has both amount and date/time stamp
    public Test(String customerName, String branchName, String email, String phoneNumber, double balance) {
            this.customerName = customerName;
            this.branchName = branchName;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.balance = balance;
            this.transactions = new ArrayList<>(5000);
            Date date = new Date();
            Monies firstTransaction = new Monies(balance, date);
            transactions.add(firstTransaction);
        }

        public Test updateInformation(Test customer, String updateName,
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
        public Test  addUpdateInformation(Test customer,
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

        public void printCustomer(){//need to refactor for "double amount" and "Date date"
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
            for (Monies m : transactions) {
                System.out.println("Transactions: " + "$" + m.balance() + " -- " + m.date());
                totalBalance += m.balance();
            }
            System.out.println("Total balance: " + "$" + totalBalance);
        }

        public void printCustomers() {
        double totalBalance = 0;
            System.out.printf("-%n".repeat(30) + "%n" + "Name: " + customerName + "%n" + "Branch: " + branchName + "%n" + "Email: " + email
                    + "%n" + "Phone: " + phoneNumber + "%n" + "Balance: " + balance + "2%n" + "-".repeat(30));

            for (Monies m : transactions) {
                System.out.println("Transactions: " + "$" + m.balance() + " -- " + m.date());
                totalBalance += m.balance();
            }
            System.out.println("Total balance: " + "$" + totalBalance);

        }
}
