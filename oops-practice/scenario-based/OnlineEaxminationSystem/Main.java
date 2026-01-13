package OnlineEaxminationSystem;
public class Main {
    public static void main(String[] args) {

        Exam exam = new Exam("Java Test");

        Question q1 = new ObjectiveQuestion(5, "A");
        Question q2 = new DescriptiveQuestion(10);

        exam.addQuestion(q1);
        exam.addQuestion(q2);

        EvaluationStrategy objEval = new ObjectiveEvaluation();
        EvaluationStrategy descEval = new DescriptiveEvaluation();

        ExamService service =
                new ExamService(System.currentTimeMillis() + 60000);

        try {
            int score1 = service.submitAnswer(q1, "A", objEval);
            int score2 = service.submitAnswer(q2, "Good answer", descEval);

            System.out.println("Total Score: " + (score1 + score2));
        } catch (ExamTimeExpiredException e) {
            System.out.println(e.getMessage());
        }
    }
}

