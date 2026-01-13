package OnlineEaxminationSystem;

import java.util.*;

public class ExamService {
    // Manages exam submission and evaluation
  
    private long examEndTime;

    public ExamService(long examEndTime) {
        this.examEndTime = examEndTime;
    }

    public int submitAnswer(Question q, String answer, EvaluationStrategy strategy)
            throws ExamTimeExpiredException {

        if (System.currentTimeMillis() > examEndTime)
            throw new ExamTimeExpiredException("Exam time expired");

        return strategy.evaluate(q, answer);
    }
}

