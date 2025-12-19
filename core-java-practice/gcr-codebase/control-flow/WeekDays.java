import java.util.*;

public class WeekDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month: ");
        int m = sc.nextInt();
        System.out.print("Enter day: ");
        int d = sc.nextInt();
        System.out.print("Enter year: ");
        int y = sc.nextInt();
        int y0 = y - (14 - m) / 12;
        // Adjust year for month
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
         // Calculate leap year contributions   
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        // Adjust month
        int d0 = (d + x + (31 * m0) / 12) % 7;
        // Calculate day of week
        System.out.println("Day of week: " + d0);
    }
}

