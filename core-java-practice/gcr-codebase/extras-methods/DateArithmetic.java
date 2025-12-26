import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {
        LocalDate inputDate = readDate();
        LocalDate finalDate = calculateDate(inputDate);
        System.out.println("Final Date: " + finalDate);
    }

    // Takes date input from the user
    static LocalDate readDate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date (YYYY-MM-DD): ");
        return LocalDate.parse(sc.next());
    }
    // Performs date arithmetic operations
    static LocalDate calculateDate(LocalDate date) {
        date = date.plusDays(7);
        date = date.plusMonths(1);
        date = date.plusYears(2);
        date = date.minusWeeks(3);
        return date;
    }
}

