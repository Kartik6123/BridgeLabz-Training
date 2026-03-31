import java.util.*;

class InvalidMarkException extends Exception {
    InvalidMarkException(String msg) {
        super(msg);
    }
}

class Student {
    String name;
    int[] marks;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }
}

class StudentReportGenerator {

    static double calculateAverage(int[] marks) {
        int sum = 0;
        for (int m : marks) sum += m;
        return (double) sum / marks.length;
    }

    static String assignGrade(double avg) {
        if (avg >= 80) return "A";
        if (avg >= 60) return "B";
        if (avg >= 40) return "C";
        return "Fail";
    }

    static void validateMarks(int[] marks) throws InvalidMarkException {
        // ensure marks are within valid range
        for (int m : marks) {
            if (m < 0 || m > 100) {
                throw new InvalidMarkException("Invalid mark found: " + m);
            }
        }
    }

    static void displayReport(Student s, String[] subjects)
            throws InvalidMarkException {

        validateMarks(s.marks);

        System.out.println("\n----- Report Card -----");
        System.out.println("Student Name: " + s.name);
        System.out.println("-----------------------");

        for (int i = 0; i < subjects.length; i++) {
            // formatted output for clean report
            System.out.printf("%-10s : %d\n", subjects[i], s.marks[i]);
        }

        double avg = calculateAverage(s.marks);
        System.out.println("-----------------------");
        System.out.printf("Average     : %.2f\n", avg);
        System.out.println("Grade       : " + assignGrade(avg));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] subjects = { "Maths", "Science", "English", "Computer" };
        List<Student> students = new ArrayList<>(); // stores multiple students

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            int[] marks = new int[subjects.length];
            System.out.println("Enter marks:");

            for (int j = 0; j < subjects.length; j++) {
                marks[j] = sc.nextInt();
            }
            sc.nextLine();

            students.add(new Student(name, marks));
        }

        for (Student s : students) {
            try {
                displayReport(s, subjects);
            } catch (InvalidMarkException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
