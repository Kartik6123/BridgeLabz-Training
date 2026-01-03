package inheritance;

public class Employee {
    String name;
    int id;
    int salary;
    Employee(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void displayDetails(){
     System.out.println("Name :"+name);
     System.out.println("ID :"+id);
     System.out.println("Salary :"+salary);
    }
}
class Manager extends Employee{
    int teamSize;
    Manager(String name,int id,int salary,int teamSize){
        super(name,id,salary);
        this.teamSize=teamSize;
    }
    void display(){
     System.out.println("Name :"+name);
     System.out.println("ID :"+id);
     System.out.println("Salary :"+salary);
     System.out.println("TeamSize :"+teamSize);
    }
}
class Developer extends Employee{
    String programmingLanguage;
    Developer(String name,int id,int salary,String programmingLanguage){
        super(name,id,salary);
        this.programmingLanguage=programmingLanguage;
    }
    void display(){
     System.out.println("Name :"+name);
     System.out.println("ID :"+id);
     System.out.println("Salary :"+salary);
     System.out.println("Programming Language :"+programmingLanguage);
    }
}
class Main{
    public static void main(String[] args) {
        Employee emp=new Employee("Alice",101,50000);
        emp.displayDetails();
        System.out.println("--------------");
        Manager mgr=new Manager("Bob",102,80000,5);
        mgr.display();
        System.out.println("--------------");
        Developer dev=new Developer("Charlie",103,60000,"Java");
        dev.display();
    }
}
