package OnlineEaxminationSystem;

public abstract class Question {
    protected int marks;
    public Question(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }
}

