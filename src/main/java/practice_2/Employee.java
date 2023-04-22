package practice_2;


import java.util.ArrayList;
import java.util.Scanner;

public class Employee {

    String fist_name;
    String last_name;



    Employee[] arr = new Employee[3];
    public Employee() {
        this.fist_name = "NoName";
        this.last_name = "NoName";
    }
    public Employee(String fist_name, String last_name) {
        this.fist_name = fist_name;
        this.last_name = last_name;

    }

    public void setEmpCred(String fname, String lname){
        this.fist_name = fname;
        this.last_name = lname;
    }

    public void displayEmployee(){
        System.out.println("First Name: "+ this.fist_name + ", Last Name: "+ this.last_name);
    }


    public static void main(String[] args){

        Employee emp1 = new Employee("Aakash", "Sharma");
        Employee emp2 = new Employee("Ananshu", "Bhatt");

        Employee emp3 = new Employee();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first name: ");
        String first_name = input.nextLine();

        System.out.println("Enter the last name: ");
        String last_name = input.nextLine();

        emp3.setEmpCred(first_name,last_name);

        ArrayList<Employee> arr = new ArrayList<Employee>();

        arr.add(emp1);
        arr.add(emp2);
        arr.add(emp3);

        System.out.println(arr.get(0).fist_name);
        for (Employee employee : arr) {
            System.out.println("Fist name: " + employee.fist_name + ", Last Name: " + employee.last_name);
        }

    }
}








