package progentis.com;

public class Test {

    public Test() {

    }

    Customer addUpdateInformation(Customer customer,//no access modifier to make package private
                                  String updateName,
                                  String updateBranch,
                                  String updateEmail,
                                  String updatePhone,
                                  double updateBalance) {
        if (updateName.equalsIgnoreCase("NC")) {
            updateName = customer.customerName;
        }
        customer.customerName = updateName;
        if (updateBranch.equalsIgnoreCase("NC")) {
            updateBranch = customer.branchName;
        }
        customer.branchName = updateBranch;
        if (updateEmail.equalsIgnoreCase("NC")) {
            updateEmail = customer.email;
        }
        customer.email = updateEmail;
        if (updatePhone.equalsIgnoreCase("NC")) {
            updatePhone = customer.phoneNumber;
        }
        customer.phoneNumber = updatePhone;
        if (updateBalance == customer.balance) {
            updateBalance = customer.balance;
        }
        customer.balance = updateBalance;
        return customer;
    }
}
