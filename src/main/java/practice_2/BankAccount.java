package practice_2;
public class BankAccount {

    double amount;
    int accNumber;

    public BankAccount() {
        this.amount = 0.0d;
        this.accNumber = 0;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getAccNumber() {
        return this.accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public void makeAcct(Employee temp){
        System.out.println("Account made!");
    }

    public static void main(String[] args) {



    }
}
