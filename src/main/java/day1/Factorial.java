package day1;

public class Factorial {

    public static void main(String[] args){
        System.out.println("Factorial of the number:");
        int num = 5;
        int fact = 1;

        for(int i=num;i>=1;i--){
            fact = fact*i;
        }

        System.out.println(fact);
    }
}
