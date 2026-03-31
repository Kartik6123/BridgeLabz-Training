import java.util.Scanner;

public class StudentMarksQuiz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array storing correct answers
        String[] correctAnswers = {
                "A", "C", "B", "D", "A",
                "B", "C", "D", "A", "C"
        };

        // Array to store student answers
        String[] studentAnswers = new String[10];

        System.out.println("Enter your answers (A/B/C/D):");

        // Taking student answers
        for (int i = 0; i < studentAnswers.length; i++) {
            System.out.print("Question " + (i + 1) + ": ");
            studentAnswers[i] = sc.nextLine();
        }

        // Calculate total score
        int score = calculateScore(correctAnswers, studentAnswers);

        System.out.println("Quiz Feedback:");

        // Display feedback for each question
        for (int i = 0; i < correctAnswers.length; i++) {
            if (correctAnswers[i].equalsIgnoreCase(studentAnswers[i])) {
                System.out.println("Question " + (i + 1) + ": Correct");
            } else {
                System.out.println("Question " + (i + 1) + ": Incorrect");
            }
        }

        // Calculate percentage
        double percentage = (score / 10.0) * 100;

        System.out.println("Final Score: " + score + "/10");
        System.out.println("Percentage: " + percentage + "%");

        // Pass or Fail decision
        if (percentage >= 50) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }

    // Method to calculate score by comparing answers
    static int calculateScore(String[] correct, String[] student) {
        int score = 0;

        for (int i = 0; i < correct.length; i++) {
            if (correct[i].equalsIgnoreCase(student[i])) {
                score++;
            }
        }
        return score;
    }
}

