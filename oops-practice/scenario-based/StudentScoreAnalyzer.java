import java.util.*;

class InvalidScoreException extends Exception {
    InvalidScoreException(String msg) {
        super(msg);
    }

}
class StudentScoreAnalyzer {

    static double calculateAverage(int[] arr) { 
        // calculate average
        int sum = 0;
        for (int x : arr) sum += x;
        return (double) sum / arr.length;
    }

    static int findMax(int[] arr) { 
        // find maximum score
        int max = arr[0];
        for (int x : arr) if (x > max) max = x;
        return max;
    }

    static int findMin(int[] arr) {
        // find minimum score
        int min = arr[0];
        for (int x : arr) if (x < min) min = x;
        return min;
    }

    static void validateScores(int[] arr) throws InvalidScoreException {
        // validate scores
        for (int x : arr) {
            if (x < 0 || x > 100) {
                throw new InvalidScoreException("Invalid score found: " + x);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] scores = new int[n];

        System.out.println("Enter scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        try {
            validateScores(scores);

            System.out.println("Average Score: " + calculateAverage(scores));
            System.out.println("Highest Score: " + findMax(scores));
            System.out.println("Lowest Score: " + findMin(scores));

        } catch (InvalidScoreException e) {
            System.out.println(e.getMessage());
        }
    }
}

