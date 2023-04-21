package practice_1;

public class Employee {

    String first_name;
    String last_name;
    int empId;
    int salaray;


    public Employee(){
        this.first_name="NoName";
        this.last_name = "NoName";
        this.empId = 0000000;
        this.salaray = 0000000;
    }
    public  Employee(String fname, String lname, int id, int salaray){
        this.first_name = fname;
        this.last_name = lname;
        this.empId = id;
        this.salaray = salaray;
    }

    public void printEmployee(){
        System.out.println("First Name: "+this.first_name);
        System.out.println("Last Name: "+this.last_name);
        System.out.println("Employee ID: "+this.empId);
        System.out.println("Employee Salary: "+this.salaray);
    }

    public static void main(String[] args){

        Employee obj1 = new Employee("Aakash", "Sharma", 11, 10000);
        Employee obj2 = new Employee("Ananshu", "Bhatt", 12, 20000);

        obj1.printEmployee();
        System.out.println();
        obj2.printEmployee();


    }

}
