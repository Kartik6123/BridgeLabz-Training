import java.util.*;

class MonthlyCalendar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month  ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        String monthName = getMonth(month);
        int monthDays = getDays(month, year);
        int firstDay = getFirstDay(month, year);

        System.out.println( monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < firstDay; i++) {
              //  indentation before 1st date
            System.out.print("    ");
        }
        for (int day = 1; day <= monthDays; day++) {
             //   print dates
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
    static String getMonth(int m) {
        //  Method to get month name
        String[] months = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
        };
        return months[m - 1];
    }
    static int getDays(int m, int y) {
         //  Method to get number of days in a month
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (m == 2 && isLeapYear(y)) {
            return 29;
        }
        return days[m - 1];
    }
    static boolean isLeapYear(int y) {
        // Leap year check
        if (y % 400 == 0)
            return true;
        if (y % 100 == 0)
            return false;
        return y % 4 == 0;
    }
    
    static int getFirstDay(int m, int y) {
        //  Method to find first day using Gregorian algorithm
        int d = 1;
        // first day of month
        int y0 = y - (14 - m) / 12;
        // adjust year
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        // leap year correction
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        //adjust month
        int d0 = (d + x + (31 * m0) / 12) % 7;
        // day of week
        return d0; 
        // 0 = Sunday
    }
}

