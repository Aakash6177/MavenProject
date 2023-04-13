package day1;

public class HelloWorld {

    public static void main(String[] args){
        String username = "User";
        if(args.length>0){
            username = args[0];
        }
        System.out.println("Hi "+ username + "Welcome to JAVA world");

    }
}
