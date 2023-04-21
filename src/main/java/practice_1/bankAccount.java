package practice_1;
import practice_1.Employee;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class bankAccount {

    String accHolderName;
    double amount;
    int accNumber;

    public bankAccount(){
        accHolderName="NoName";
        accNumber = 000;
        amount = 000;
    }
    public bankAccount(Employee emp){

        Random random = new Random();
        int accountNumber = random.nextInt(20000000-10000000)+10000000;

        accHolderName = emp.first_name;
        accNumber = accountNumber;
        amount = emp.salaray;

    }

    public double viewAmount(){
        return this.amount;
    }

    public void addAmount(double amt){
        this.amount += amt;
        System.out.println("Amount added "+amt + " to "+this.accNumber);
        System.out.println();
        System.out.println("====================");
    }

    public void widAmount (double amt){
        this.amount -= amt;
        System.out.println("Amount to withdrawn: "+amt + " from "+ this.accNumber);
        System.out.println();
        System.out.println("====================");
    }

    public void printAccount (){
        System.out.println("acc holder name: "+accHolderName);
        System.out.println("total amount: "+amount);
        System.out.println("acc number: "+accNumber);
        System.out.println();
    }

    public bankAccount adduser(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.toString();

        System.out.println("Enter your amount");
        int amount = input.nextInt();

        Random random = new Random();
        int accountNumber = random.nextInt(20000000-10000000)+10000000;

        bankAccount temp = new bankAccount();
        temp.accHolderName = name;
        temp.amount = amount;
        temp.accNumber = accountNumber;

        return temp;

    }

//    public void printBankAccount(ArrayList arr){
//        for (bankAccount i: arr) {
//            System.out.println("First name: "+i.accHolderName);
//            System.out.println("Account number: "+i.accNumber);
//            System.out.println("Current amount: "+i.amount);
//        }
//    }


    public static  void main(String[] args){

        Employee obj1 = new Employee("Aakash", "Sharma", 11, 10000);
        Employee obj2 = new Employee("Ananshu", "Bhatt", 12, 20000);
        Employee obj3 = new Employee();

        bankAccount b1 = new bankAccount(obj1);
        bankAccount b2 = new bankAccount(obj2);
        bankAccount b3 = new bankAccount();


        b1.printAccount();
        b2.printAccount();

        b1.addAmount(1200);
        b1.printAccount();

        b2.addAmount(199);
        b2.printAccount();

        b2.widAmount(99);
        b2.printAccount();

        bankAccount[] array = new bankAccount[2];

        array[0] = b1;
        array[1] = b2;

        for(int i=0;i<array.length;i++){
            System.out.println("Account index :" +(i+1)+ ", "+" name: "+array[i].accHolderName+ ", "+" account number: "+array[i].accNumber

            +", "+"amount: "+array[i].amount + "||");
        }

        ArrayList<bankAccount> array2 = new ArrayList<bankAccount>();
        array2.add(b1);
        array2.add(b2);

        for(bankAccount i: array2){
            System.out.println("First NAME: "+i.accHolderName);
            System.out.println("Account Number: "+i.accNumber);
            System.out.println("Current Amount: "+i.amount);
        }



        b3 = b3.adduser();

        array2.add(b3);



    }


}
