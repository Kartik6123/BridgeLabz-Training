import java.util.function.Function;
public class StringLengthChecker {

    public static void main(String[] args) {
        String message = "Welcome to Java Functional Interfaces";
        int maxLimit = 20;

        // Function functional interface
        Function<String, Integer> getLength =str -> str.length();

        int length = getLength.apply(message);
        if (length > maxLimit) {
            System.out.println("Message exceeds character limit");
        } else {
            System.out.println("Message is within limit");
        }
    }
}
