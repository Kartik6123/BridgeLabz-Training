import java.util.*;
public class LibraryReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Book number " + i); 
              // Book number
            System.out.print("Enter borrowed date");
            int borrowedDate = sc.nextInt();
            System.out.print("Enter return date");
            int returnDate = sc.nextInt();
              // Return date
            if (returnDate > borrowedDate) {
                int lateDays = returnDate - borrowedDate;
              // calculate late days
                int fine = lateDays * 5;
                System.out.println("Late by " + lateDays + " days");
                System.out.println("Fine:" + fine);
            } else {
                System.out.println("Returned on time. No fine.");
            }
        }
    }
}

