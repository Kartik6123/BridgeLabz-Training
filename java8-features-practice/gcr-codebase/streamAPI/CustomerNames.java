import java.util.*;

public class CustomerNames {
    public static void main(String[] args) {

        List<String> names = Arrays.asList(
            "ankit", "rahul", "mohit", "sneha", "priya"
        );

        names.stream()
             .map(name -> name.toUpperCase())   // convert to uppercase
             .sorted()                           // sort alphabetically
             .forEach(System.out::println);     // display
    }
}
