package practice_4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner sc_name = new Scanner(System.in);
        Scanner sc_salary = new Scanner(System.in);

//        System.out.println("Enter name");
//        String name = sc_name.nextLine();
//        System.out.println("Enter Salary");
//        double salary = sc_salary.nextDouble();



//        Person p = new Person(name, salary);
        List<Person> personList = new ArrayList<>();
//        personList.add(p);


        int flag = 0;
        while(flag != -1){


            System.out.println("Enter name");
            String name = sc_name.nextLine();
            System.out.println("Enter Salary");
            double salary = sc_salary.nextDouble();
            Person temp = new Person(name,salary);
            personList.add(temp);

            System.out.println("Enter -1 to exit");
            flag = input.nextInt();


        }



        for(Person ele:personList){
            System.out.println(ele.name+", "+ele.salary);
        }

        String file = "src/main/resources/output.txt";

        try{
            FileWriter writer = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            for(Person ele: personList){
                bufferedWriter.write(ele.name+", "+ele.salary);
                bufferedWriter.newLine();

            }
            System.out.println("Data successfully written");
            bufferedWriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
