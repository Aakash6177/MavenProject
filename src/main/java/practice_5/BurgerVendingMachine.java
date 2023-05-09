package practice_5;

import java.util.Scanner;

public class BurgerVendingMachine {

    public static void main(String[] args) {

        System.out.println("-".repeat(100));
        System.out.println(" ".repeat(30)+"WELCOME TO BURGER VENDING MACHINE" + " ".repeat(40));
        System.out.println("-".repeat(100));

        Burger b1 = new Burger();
        CheeseBurger b2 = new CheeseBurger();

        b1.showDetails();
        System.out.println();
        b2.showDetails();

        b2.setTomatoeQuantity(23);
        b2.showDetails();






    }
}
