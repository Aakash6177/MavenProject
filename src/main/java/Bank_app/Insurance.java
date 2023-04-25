package Bank_app;

import java.util.concurrent.ThreadLocalRandom;

public class Insurance {

    String policyHolderFName;
    String policyHolderLName;
    int EmployeeID;
    int policyNumber;

    public Insurance(String policyHolderFName, String policyHolderLName, int employeeID) {
        this.policyHolderFName = policyHolderFName;
        this.policyHolderLName = policyHolderLName;
        EmployeeID = employeeID;

        int min = 10000; int max = 19999;
        this.policyNumber = ThreadLocalRandom.current().nextInt(min, max);

    }

    public static void main(String[] args) {

    }
}
