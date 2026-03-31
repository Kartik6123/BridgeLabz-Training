package OnlineEaxminationSystem;

public class DescriptiveEvaluation implements EvaluationStrategy {

    public int evaluate(Question q, String answer) {
        return q.getMarks() / 2;
    }
}

