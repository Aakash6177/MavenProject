package day1;

import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number");
        float num1 = input.nextFloat();

        System.out.println("Enter the second number");
        float num2 = input.nextFloat();

        float sum = num1+num2;
        System.out.println("The sum of three numbers is " + sum );

        float avg = sum/2;
        System.out.println("The average of two numbers "+ avg);

    }
}
