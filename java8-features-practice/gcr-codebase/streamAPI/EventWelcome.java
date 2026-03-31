import java.util.*;

public class EventWelcome {
    public static void main(String[] args) {

        List<String> attendees = Arrays.asList(
            "Ankit", "Rahul", "Sneha", "Priya"
        );

        attendees.stream()
                 .forEach(name -> 
                     System.out.println("Welcome to the event, " + name + "!")
                 );
    }
}
