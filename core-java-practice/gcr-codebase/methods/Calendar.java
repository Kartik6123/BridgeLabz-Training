import java.util.Scanner;

public class Calendar {

    // Returns the name of the month
    static String monthTitle(int m) {
        String[] names = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        return names[m - 1];
    }

    // Checks if the given year is a leap year
    static boolean leap(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    // Returns number of days in a given month
    static int totalDays(int m, int y) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (m == 2 && leap(y)) {
            return 29;
        }
        return days[m - 1];
    }

    // Finds the starting day of the month
    static int startingDay(int m, int y) {
        int d = 1;

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;

        return (d + x + (31 * m0) / 12) % 7;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        String title = monthTitle(month);
        int days = totalDays(month, year);
        int start = startingDay(month, year);

        // Print calendar header
        System.out.println("\n  " + title + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Initial spacing before first date
        for (int i = 0; i < start; i++) {
            System.out.print("    ");
        }

        // Print dates
        for (int d = 1; d <= days; d++) {
            System.out.printf("%3d ", d);

            if ((d + start) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
        
    }
}

