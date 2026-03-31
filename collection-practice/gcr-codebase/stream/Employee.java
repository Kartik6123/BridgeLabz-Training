import java.io.*;
import java.util.*;

class Employee implements Serializable {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class EmployeeSerialization {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1, "Amit", "IT", 50000));
        list.add(new Employee(2, "Neha", "HR", 45000));
        list.add(new Employee(3, "Rahul", "Finance", 60000));

        // -------- Serialization --------
        try {
            ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("employees.dat"));

            oos.writeObject(list);
            oos.close();

            System.out.println("Employees saved successfully.");

        } catch (IOException e) {
            System.out.println("Error during serialization");
        }

        // -------- Deserialization --------
        try {
            ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("employees.dat"));

            List<Employee> empList = (List<Employee>) ois.readObject();

            for (Employee e : empList) {
                System.out.println(
                    e.id + " " + e.name + " " + e.department + " " + e.salary
                );
            }

            ois.close();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization");
        }
    }
}
