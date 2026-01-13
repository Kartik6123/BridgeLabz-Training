package OnlineEaxminationSystem;

import java.util.*;

public class Exam {
    private String title;
    private List<Question> questions = new ArrayList<>();

    public Exam(String title) {
        this.title = title;
    }

    public void addQuestion(Question q) {
        questions.add(q);
    }

    public List<Question> getQuestions() {
        return questions;
    }
}