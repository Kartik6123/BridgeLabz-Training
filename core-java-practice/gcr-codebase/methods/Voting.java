import java.util.Scanner;

public class Voting {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] studentAges = new int[10];

        for (int index = 0; index < studentAges.length; index++) {
            System.out.print("Enter age of student " + ": ");
            studentAges[index] = sc.nextInt();
            //input age of student
            boolean canVote = canStudentVote(studentAges[index]);
            if (canVote)
                System.out.println("Student is eligible to vote");
            else
                System.out.println("Student is not eligible to vote");
        }
    }

    public static boolean canStudentVote(int age) {
        // Method to check whether a student can vote based on age
        if (age < 0)
            return false;
        if (age >= 18)
            return true;
        else
            return false;
    }
}
