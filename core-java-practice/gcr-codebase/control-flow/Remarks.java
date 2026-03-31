import java.util.Scanner;

public class Remarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for the three subjects
        System.out.println("Enter marks for three subjects");
        System.out.print("Physics: ");
        int physics = scanner.nextInt();
        System.out.print("Chemistry: ");
        int chemistry = scanner.nextInt();
        System.out.print("Maths: ");
        int maths = scanner.nextInt();

        // Calculate total marks and percentage
        int totalMarks = physics + chemistry + maths;
        double percentage = (double) totalMarks / 300 * 100; // Assuming max marks for each subject is 100
        double averageMarks = totalMarks / 3.0;
        String grade;
        String remarks;
        // Determine the grade and remarks based on the percentage
        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }
        // Ensure the Output clearly shows the Average Mark as well as the Grade and Remarks
        System.out.println("Average Marks:," + averageMarks);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        
        scanner.close();
    }
}

