public class ExamApp {
    public static void main(String[] args) {

        ExamProctor ep = new ExamProctor();

        ep.visitQuestion(1);
        ep.visitQuestion(2);
        ep.visitQuestion(3);

        ep.submitAnswer(1, "A");
        ep.submitAnswer(2, "B");
        ep.submitAnswer(3, "D");

        ep.lastVisitedQuestion();

        System.out.println("Final Score: " + ep.calculateScore());
    }
}
