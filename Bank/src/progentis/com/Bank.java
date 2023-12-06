package progentis.com;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;

    public Bank() {
        this.branches = new ArrayList<>();
    }

    void addBranch(Branch branch) {
        branches.add(branch);
    }

    void customerReport() {

    }

    void branchReport() {

    }


}
