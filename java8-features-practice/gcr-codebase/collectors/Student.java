import java.util.*;
import java.util.stream.*;

class Student {
    String name, grade;
    Student(String n, String g) { name = n; grade = g; }
    String getName() { return name; }
    String getGrade() { return grade; }
}

public class Main {
    public static void main(String[] args) {

        List<Student> l = Arrays.asList(
            new Student("Ravi", "A"),
            new Student("Neha", "A"),
            new Student("Amit", "B")
        );

        Map<String, List<String>> m =
            l.stream().collect(
                Collectors.groupingBy(
                    Student::getGrade,
                    Collectors.mapping(Student::getName, Collectors.toList())
                )
            );

        System.out.println(m);
    }
}
