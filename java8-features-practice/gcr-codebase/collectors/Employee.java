import java.util.*;
import java.util.stream.*;

public class Employee {
    String d;
    double s;
    Employee(String d, double s) { this.d = d; this.s = s; }
    String getDepartment() { return d; }
    double getSalary() { return s; }
}

 class Main {
    public static void main(String[] args) {

        List<Employee> l = Arrays.asList(
            new Employee("IT", 70000),
            new Employee("IT", 80000),
            new Employee("HR", 40000)
        );

        Map<String, Double> m =
            l.stream().collect(
                Collectors.groupingBy(
                    Employee::getDepartment,
                    Collectors.averagingDouble(Employee::getSalary)
                )
            );
       

        System.out.println(m);
    }
}
