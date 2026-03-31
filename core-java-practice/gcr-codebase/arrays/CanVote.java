import java.util.*;

class CanVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[10];
        // Input ages
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            age[i] = sc.nextInt();
        }
        // Check wether can vote or not
        for (int i = 0; i < age.length; i++) {
            if (age[i] < 0) {
                System.out.println("Invalid age: " + age[i]);
            } else if (age[i] >= 18) {
                System.out.println("The student with the age " + age[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + age[i] + " cannot vote.");
            }
        }
    }
}

