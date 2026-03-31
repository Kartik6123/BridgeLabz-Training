import java.util.*;

class InvalidQuizSubmissionException extends Exception {
    InvalidQuizSubmissionException(String msg) {
        super(msg);
    }
}

class QuizProcessor {

    static int calculateScore(String[] correct, String[] user)
            throws InvalidQuizSubmissionException {

        // validate answer length
        if (correct.length != user.length) {
            throw new InvalidQuizSubmissionException("Answer length mismatch");
        }

        int score = 0;
        for (int i = 0; i < correct.length; i++) {
            // case-insensitive comparison of answers
            if (correct[i].equalsIgnoreCase(user[i])) {
                score++;
            }
        }
        return score;
    }

    static String getGrade(int score, int total) {
        double percent = (score * 100.0) / total;

        if (percent >= 80) return "A";
        if (percent >= 60) return "B";
        if (percent >= 40) return "C";
        return "Fail";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] correctAnswers = { "A", "B", "C", "D", "A" };

        List<Integer> scores = new ArrayList<>(); // stores scores of all users

        System.out.print("Enter number of users: ");
        int users = sc.nextInt();
        sc.nextLine();

        for (int u = 1; u <= users; u++) {
            System.out.println("Enter answers for user " + u + ":");
            String[] userAnswers = new String[correctAnswers.length];

            for (int i = 0; i < userAnswers.length; i++) {
                userAnswers[i] = sc.nextLine();
            }

            try {
                int score = calculateScore(correctAnswers, userAnswers);
                scores.add(score);
                System.out.println("Score: " + score);
                System.out.println("Grade: " + getGrade(score, correctAnswers.length));
            } catch (InvalidQuizSubmissionException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("All Scores: " + scores);
    }
}
