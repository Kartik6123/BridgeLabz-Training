import java.util.*;

// Employee class
class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return name;
    }
}

public class GroupByDepartment {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR"),
            new Employee("Bob", "IT"),
            new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> map = new HashMap<>();

        for (Employee emp : employees) {
            map
                .computeIfAbsent(emp.department, d -> new ArrayList<>())
                .add(emp);
        }

        System.out.println(map);
    }
}
