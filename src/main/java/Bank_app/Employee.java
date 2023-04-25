package Bank_app;

import java.util.Scanner;

public class Employee {

    String empFName;
    String empLName;
    int empID;


    public Employee(){
        this.empFName = "NoName";
        this.empLName = "NoName";
        this.empID = 0;
    }

    public Employee(String f_name, String l_name, int emp_id){
        this.empFName = f_name;
        this.empLName = l_name;
        this.empID = emp_id;
    }

    public void printEmployeeDetails(){
        System.out.println();
    }
    public static void main(String[] args) {

        Employee emp = new Employee();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Employee's first name: ");
        String fname = input.nextLine();

        System.out.println("Enter the Employee's last name: ");
        String lname = input.nextLine();

        System.out.println("Enter the Employee's ID: ");
        int id = input.nextInt();

        emp.empFName = fname;
        emp.empLName = lname;
        emp.empID = id;

        Insurance emp_p1 = new Insurance(emp.empFName, emp.empLName, emp.empID);

        BankAccount emp_b1 = new BankAccount(emp.empFName, emp.empLName);

        Employee[] emp_Arr = new Employee[10];

        emp_Arr[0] = emp;



    }
}
