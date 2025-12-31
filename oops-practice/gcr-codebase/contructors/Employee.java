package contructors;

public class Employee {
    public int employeeId;
    protected String depatment;
    private double salary;

    Employee() {
        // default constructor
        this.employeeId = 0;
        this.depatment = "";
        this.salary = 0.0;
    }
    Employee(int employeeId, String depatment, double salary) {
        // parameterized constructor
        this.employeeId = employeeId;
        this.depatment = depatment;
        this.salary = salary;
    }
    double getSalary() {
        // getter method
        return this.salary;
    }
    void setSalary(double newSalary) {
        //  setter method
        if(newSalary < 0.0) {
            System.out.println("Invalid salary value. It cannot be negative. Old salary retained.");
            return;
        }
        this.salary = newSalary;
    }
}
 class Manager extends Employee{
    Manager(){
        super();
        // default constructor pointing to parent class
    }
    Manager(int employeeId, String depatment, double salary){
        super(employeeId, depatment, salary);
        // parameterized constructor pointing to parent class
    }
    void display(){
        System.out.println("Employee ID: " + this.employeeId);
        System.out.println("Department: " + this.depatment);
        System.out.println("Salary: " + this.getSalary());
    }
 }
    class Main{
        public static void main(String[] args) {
            Manager manager = new Manager(101, "Sales", 75000.0);
            manager.display();
        }
    }
