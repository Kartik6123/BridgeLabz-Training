class EmployeeDetails{
    String  name;
    int id;
    int salary;
    EmployeeDetails(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
    public static void main(String[] args) {
         EmployeeDetails emp = new EmployeeDetails("Kartik", 101, 50000);
            emp.display();
    }
}