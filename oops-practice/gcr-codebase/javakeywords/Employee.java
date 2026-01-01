package javakeywords;

public class Employee {
    static String companyName;
    static int totalEmployees;
    String name;
    final int id;
    String designation;

    static void displayCompanyInfo() {
        // static method
        System.out.println("Company: " + companyName + ", Total Employees: " + totalEmployees);
    }
    Employee(String name, int id, String designation) {
        // constructor
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }
    void displayEmployeeDetails() {
        // instance method
        if(this instanceof Employee){
            // using 'this' keyword
            System.out.println("Name: " + name + ", ID: " + id + ", Designation: " + designation);
        }
    }
    public static void main(String[] args) {
        Employee.companyName = "Tech Solutions";
        Employee.totalEmployees = 0;
        Employee.displayCompanyInfo();

        Employee emp1 = new Employee("Alice", 101, "Developer");
        Employee emp2 = new Employee("Bob", 102, "Designer");

        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();

        Employee.displayCompanyInfo();
    }
}
