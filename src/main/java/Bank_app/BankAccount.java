package Bank_app;

import java.util.concurrent.ThreadLocalRandom;

public class BankAccount {

    String accHolderFName;
    String accHolderLName;
    int accNumber;
    double balance;

    public BankAccount(){
        this.accHolderFName  = "NoName";
        this.accHolderLName  = "NoName";
        this.accNumber = -1;
        this.balance = -1;

    }

    public BankAccount(String fName, String lName){
        this.accHolderFName = fName;
        this.accHolderLName = lName;
        this.balance = 100;

        int min=10000; int max=19999;
        this.accNumber = ThreadLocalRandom.current().nextInt(min, max);
    }

    public static void main(String[] args) {

    }
}
