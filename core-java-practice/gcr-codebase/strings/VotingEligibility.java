import java.util.*;
class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = 10;
        int[] ages = AgeInput(students);
        String[][] result = checkVotingEligibility(ages);

        displayResult(result);
    }
    // Method to generate random 2-digit ages for 10 students
    static int[] AgeInput(int n) {
        int[] ages = new int[n];
        for(int i=0;i<n;i++) {
            ages[i] = (int)(Math.random() * 100); // Random age between 0 and 99
        }
        return ages;
    }

    // Method to check voting eligibility and return 2D String array
    static String[][] checkVotingEligibility(int[] ages) {
        String[][] value = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            value[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                value[i][1] = "false";
            } else if (ages[i] >= 18) {
                value[i][1] = "true";
            } else {
                value[i][1] = "false";
            }
        }

        return value;
    }
    // Method to display result in tabular format
    static void displayResult(String[][] value) {
        for (int i = 0; i < value.length; i++) {
            System.out.println(value[i][0] + "\t" + value[i][1]);
        }
    }
}

