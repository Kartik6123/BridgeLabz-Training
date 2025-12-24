import java.util.*;
class ElectionBooth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter age .Press 0 to exit:");
            int age = sc.nextInt();
            if (age == 0) {
                // Exit condition
                System.out.println("Election process ended.");
                break;
            }
            // Age verification
            if (age >= 18) {
                System.out.print("Cast your vote 1,2,3: ");
                int vote = sc.nextInt();
                 // Voting process
                if (vote == 1 || vote == 2 || vote == 3) {
                    System.out.println("Vote recorded successfully.");
                } else {
                    // Invalid vote handling
                    System.out.println("Invalid vote.");
                }
            } else {
                // Underage handling
                System.out.println("Not eligible to vote.");
            }
        }
    }
}

