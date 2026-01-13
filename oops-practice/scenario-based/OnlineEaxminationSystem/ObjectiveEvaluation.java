package OnlineEaxminationSystem;

public class ObjectiveEvaluation implements EvaluationStrategy {

    public int evaluate(Question q, String answer) {
        ObjectiveQuestion oq = (ObjectiveQuestion) q;
        return oq.getCorrectAnswer().equals(answer) ? oq.getMarks() : 0;
    }
}

