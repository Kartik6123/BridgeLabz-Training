package pillarsofoops;

interface Department { 
  // Interface
  abstract void assignDepartment(String deptInfo);
  abstract void displayDepartmentInfo();
 }

abstract public class Employee {
  // Abstract Class
 private String employeeId;
 String name;
 int baseSalary;
 abstract int calculateSalary();
 public String getId() {
  return employeeId;
 }
 public void setId(String employeeId) {
  this.employeeId = employeeId;
 }
 void displayDetails() {
  System.out.println("Employee ID: " + employeeId);
  System.out.println("Name: " + name);
  System.out.println("Base Salary: " + baseSalary);
 }  
} 

 class FullTimeEmployee extends Employee implements Department {
  // Inheritance and Interface Implementation
  String deptInfo;
    int hoursWorked;
    FullTimeEmployee(String employeeId, String name, int baseSalary,int hoursWorked){ 
     super.setId(employeeId);
     this.name = name;
     this.baseSalary = baseSalary;
     this.hoursWorked=hoursWorked;
    }
   int calculateSalary(){
     return baseSalary*hoursWorked;
   }
   void displayDetails() {
     super.displayDetails();
     System.out.println("Hours Worked: " + hoursWorked);
   }
   public void assignDepartment(String deptInfo) {
      this.deptInfo = deptInfo;
    }
    public void displayDepartmentInfo() {
      System.out.println("Department Info: " + deptInfo);
}
}

   class PartTimeEmployee extends Employee  implements Department {
    // Inheritance and Interface Implementation
    String deptInfo;
    int hoursWorked;
    PartTimeEmployee(String employeeId, String name, int baseSalary,int hoursWorked){ 
     super.setId(employeeId);
     this.name = name;
     this.baseSalary = baseSalary;
     this.hoursWorked=hoursWorked;
    }
    int calculateSalary(){
      return baseSalary*hoursWorked;
    }
    void displayDetails() {
      super.displayDetails();
      System.out.println("Days Worked: " + hoursWorked);
    }
    public void assignDepartment(String deptInfo) {
      this.deptInfo = deptInfo;
    }
    public void displayDepartmentInfo() {
      System.out.println("Department Info: " + deptInfo);
}
 }

 class Main{
  public static void main(String[] args) {

    FullTimeEmployee fte = new FullTimeEmployee("FTE123", "Alice", 5000, 22);
    fte.assignDepartment("Engineering");
    fte.displayDetails();
    System.out.println("Calculated Salary: " + fte.calculateSalary());
    fte.displayDepartmentInfo();
    System.out.println();
    PartTimeEmployee pte = new PartTimeEmployee("PTE456", "Bob", 2000, 15);
    pte.assignDepartment("Marketing");
    pte.displayDetails();
    System.out.println("Calculated Salary: " + pte.calculateSalary());
    pte.displayDepartmentInfo();
    
  }
 }
  

