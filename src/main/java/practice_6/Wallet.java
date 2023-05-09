package practice_6;

public class Wallet {
    private String name;
    private String mobile;
    private double balance;

    public Wallet(){
        this.balance = 0.0;
        this.mobile = "No Number";
        this.name = "No Name";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void showDetails(){
        System.out.println("Name: "+this.getName()+ ", Mobile: "+this.getMobile()+", Balance: "+this.getBalance());
    }

    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Amount deposited!");

    }
}
