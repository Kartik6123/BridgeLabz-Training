import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        printFormattedDate(today, "dd/MM/yyyy");
        printFormattedDate(today, "yyyy-MM-dd");
        printFormattedDate(today, "EEE, MMM dd, yyyy");
    }

    // Formats and prints the date using the given pattern
    static void printFormattedDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        System.out.println(date.format(formatter));
    }
}

