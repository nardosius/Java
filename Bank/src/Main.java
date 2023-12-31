

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addBranch(new Branch("Westside"));
        bank.addBranch(new Branch("Eastside"));
        bank.addBranch(new Branch("Northside"));
        bank.addBranch(new Branch("Southside"));

        bank.branchReport();

    }
}