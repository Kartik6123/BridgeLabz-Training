import java.util.*;

class ElectionBoothManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter age (0 to exit): ");
            int age = sc.nextInt();

            if (age == 0) {
                System.out.println("Election process ended.");
                break;
            }

            if (age >= 18) {
                System.out.print("Cast your vote (1/2/3): ");
                int vote = sc.nextInt();

                if (vote == 1 || vote == 2 || vote == 3) {
                    System.out.println("Vote recorded successfully.");
                } else {
                    System.out.println("Invalid vote.");
                }
            } else {
                System.out.println("Not eligible to vote.");
            }
        }
    }
}

