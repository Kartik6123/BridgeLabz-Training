import java.util.*;

class StudentScoreCard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter students: ");
        int n = sc.nextInt();
        int[][] Marks = generateScore(n);
        double[][] calc = calcScores(Marks);
        String[][] grades = calcGrade(calc);
        display(Marks, calc, grades);
    }
    // Generate random 2-digit PCM scores using Math.random()
    static int[][] generateScore(int n) {
        int[][] marks = new int[n][3];
        for (int i = 0; i < n; i++) {
            marks[i][0] = (int)(Math.random() * 90) + 10;
            // Physics
            marks[i][1] = (int)(Math.random() * 90) + 10; 
            // Chemistry
            marks[i][2] = (int)(Math.random() * 90) + 10; 
            // Maths
        }
        return marks;
    }
    //Calculate total, avg, percentage (rounded to 2 digits)
    static double[][] calcScores(int[][] marks) {
        double[][] result = new double[marks.length][3];
        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double percentage = (total / 300.0) * 100;
            avg = Math.round(avg * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;
            result[i][0] = total;
            result[i][1] = avg;
            result[i][2] = percentage;
        }
        return result;
    }
    // Calculate grade based on percentage
    static String[][] calcGrade(double[][] calc) {
        String[][] grade = new String[calc.length][1];

        for (int i = 0; i < calc.length; i++) {
            double p = calc[i][2];

            if (p >= 80)
                grade[i][0] = "A";
            else if (p >= 70)
                grade[i][0] = "B";
            else if (p >= 60)
                grade[i][0] = "C";
            else if (p >= 50)
                grade[i][0] = "D";
            else if (p >= 40)
                grade[i][0] = "E";
            else
                grade[i][0] = "R";
        }
        return grade;
    }

    // Display scorecard in tabular format
    static void display(int[][] marks, double[][] calc, String[][] grade) {
        for (int i = 0; i < marks.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                marks[i][0] + "\t" +
                marks[i][1] + "\t" +
                marks[i][2] + "\t" +
                (int) calc[i][0] + "\t" +
                calc[i][1] + "\t" +
                calc[i][2] + "\t" +
                grade[i][0]
            );
        }
    }
}
