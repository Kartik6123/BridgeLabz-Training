import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
    }
    static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = (int) (Math.random() * 90) + 10; 
            // Physics
            scores[i][1] = (int) (Math.random() * 90) + 10; 
            // Chemistry
            scores[i][2] = (int) (Math.random() * 90) + 10; 
            // Maths
        }

        return scores;
    }

    static double[][] calculateResults(int[][] scores) {

        double[][] result = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {

            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            // Each subject is out of 100
            result[i][0] = total;
            result[i][1] = Math.round(average * 100) / 100.0;
            result[i][2] = Math.round(percentage * 100) / 100.0;
        }
        return result;
    }

    static void displayScorecard(int[][] scores, double[][] result) {
        // Display 
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAvg\tPercent");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t" +
                    scores[i][2] + "\t" +
                    (int) result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2]
            );
        }
    }
}
