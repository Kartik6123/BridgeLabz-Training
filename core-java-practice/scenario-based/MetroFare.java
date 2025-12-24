import java.util.*;

class MetroFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Load initial balance on Metro Smart Card: ₹");
        int balance = sc.nextInt();
        while (balance > 0) {
            System.out.print("Enter distance. Press 0 to exit:");
            int distance = sc.nextInt();
            if (distance == 0) {
                System.out.println("Journey ended by user.");
                break;
            }
            int fare = 0;
            // Fare initialization
            if (distance <= 5) {
                // Fare calculation
                fare = 10;
            } else if (distance <= 15) {
                fare = 20;
            } else {
                fare = 30;
            }
            if (balance >= fare) {
                balance -= fare;
                System.out.println("Fare deducted:₹" + fare);
                System.out.println("Remaining balance:₹" + balance);
            } else {
                System.out.println("Insufficient balance.");
                break;
            }
        }
    }
}
