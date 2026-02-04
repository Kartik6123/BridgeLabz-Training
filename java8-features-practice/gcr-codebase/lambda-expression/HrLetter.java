import java.util.*;

public class HrLetter {

    public static void main(String[] args) {

        List<String> employeeNames = Arrays.asList(
            "Kartik",
            "Aman",
            "Neha",
            "Riya"
        );

        // Convert all names to uppercase using method reference
        employeeNames.stream()
                     .map(String::toUpperCase)
                     .forEach(System.out::println);
    }
}
