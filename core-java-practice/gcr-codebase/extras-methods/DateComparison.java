import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Reads date text and converts it into LocalDate (yyyy-MM-dd)
        System.out.print("Enter first date (yyyy-MM-dd): ");
        LocalDate date1 = LocalDate.parse(sc.next());

        // Converts second date string into LocalDate
        System.out.print("Enter second date (yyyy-MM-dd): ");
        LocalDate date2 = LocalDate.parse(sc.next());

        // Checks if first date is earlier than second
        if (date1.isBefore(date2)) {
            System.out.println("First date is before the second date");
        }
        // Checks if first date is later than second
        else if (date1.isAfter(date2)) {
            System.out.println("First date is after the second date");
        }
        // Checks if both dates are same
        else if (date1.isEqual(date2)) {
            System.out.println("Both dates are the same");
        }
    }
}

