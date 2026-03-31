import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatUtility {
    // Interface with static method
    interface DateUtils {
        static String formatDate(LocalDate date, String pattern) {
            DateTimeFormatter formatter =
                    DateTimeFormatter.ofPattern(pattern);
            return date.format(formatter);
        }
    }

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("DD-MM-YYYY: " + DateUtils.formatDate(today, "dd-MM-yyyy"));

        System.out.println("YYYY/MM/DD: " + DateUtils.formatDate(today, "yyyy/MM/dd"));
    }
}
