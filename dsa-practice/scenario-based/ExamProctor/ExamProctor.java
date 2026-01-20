import java.util.*;

public class ExamProctor {

    private Stack<Integer> navigation = new Stack<>();
    private Map<Integer, String> answers = new HashMap<>();
    private Map<Integer, String> correctAnswers = new HashMap<>();

    public ExamProctor() {
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "C");
    }

    public void visitQuestion(int qId) {
        navigation.push(qId);
    }

    public void submitAnswer(int qId, String ans) {
        answers.put(qId, ans);
    }

    public int calculateScore() {
        int score = 0;
        for (int q : correctAnswers.keySet()) {
            if (correctAnswers.get(q).equals(answers.get(q))) {
                score++;
            }
        }
        return score;
    }

    public void lastVisitedQuestion() {
        if (navigation.isEmpty()) {
            System.out.println("No navigation history");
        } else {
            System.out.println("Last visited question: " + navigation.peek());
        }
    }
}
