package practice_6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleToIntFunction;

public class WalletService {
    private List<Wallet> list;

    public WalletService(){
        list = new ArrayList<>();
    }

    public void createWallet(Wallet wallet){

        if(isWalletExists(wallet.getMobile())){
            System.out.println("Sorry a wallet already exists with this number ");
        }
        else{
            list.add(wallet);
            System.out.println("Wallet created successfully");
        }

    }

    public void loadMoney(String mobile, double amount){
        if(isWalletExists(mobile)){
            Wallet wallet = getWallet(mobile);
            wallet.deposit(amount);
            System.out.println("Money loaded");

        }
        else{
            System.out.println("We don't ");
        }
    }

    public void viewWallets(){
        if(list.size()>0){
            for(Wallet ele:list){
                System.out.println("Mobile number: "+ele.getMobile());
            }
        }
    }
    public boolean isWalletExists(String mobile){
        boolean isExists = false;
        for(Wallet ele:list){
            if(ele.getMobile() == mobile){
                isExists = true;
                System.out.println("Wallet already exists with this phone number");
            }

        }
        return isExists;
    }

    public Wallet getWallet(String mobile){
        for(Wallet ele: list){
            if(ele.getMobile() == mobile){
                return ele;

            }
        }
        System.out.println("There is no wallet with this number in the database");
        return null;
    }
}
