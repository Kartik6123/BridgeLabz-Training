import java.util.*;
public class StudentScores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number of students.");
            return;
        }

        int[] scores = new int[n];
        int sum = 0;

        // Taking valid scores input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter score of student " + (i + 1) + ": ");
            
            if (!sc.hasNextInt()) {
                System.out.println("Non-numeric input detected.");
                return;
            }
            int score = sc.nextInt();
            if (score < 0) {
                System.out.println("Negative scores are not allowed.");
                return;
            }

            scores[i] = score;
            sum += score;
        }

        double avg = (double) sum / n;
        int max = scores[0], min = scores[0];

        // Finding highest and lowest score
        for (int i = 1; i < n; i++) {
            if (scores[i] > max) max = scores[i];
            if (scores[i] < min) min = scores[i];
        }

        System.out.println("Average Score: " + avg);
        System.out.println("Highest Score: " + max);
        System.out.println("Lowest Score: " + min);

        // Display scores above average
        System.out.println("Scores above average:");
        for (int i = 0; i < n; i++) {
            if (scores[i] > avg) {
                System.out.print(scores[i] + " ");
            }
        }
    }
}
