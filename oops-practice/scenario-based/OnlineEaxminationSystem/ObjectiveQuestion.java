package OnlineEaxminationSystem;

public class ObjectiveQuestion extends Question {
    private String correctAnswer;

    public ObjectiveQuestion(int marks, String correctAnswer) {
        super(marks);
        this.correctAnswer = correctAnswer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}

