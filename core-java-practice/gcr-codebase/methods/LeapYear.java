import java.util.*;
class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        if (year < 1582) {
            //Gregorian calendar started in 1582
            System.out.println("Year must be 1582 or later");
            return;
        }
        boolean isLeap = checkLeapYear(year);
        //method call
        if (isLeap)
            //checking leap year
            System.out.println("Year is a Leap Year");
        else
            System.out.println("Year is not a Leap Year");
    }
    public static boolean checkLeapYear(int year) {
        //method to check leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            return true;
        else
            return false;
    }
}
