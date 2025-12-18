import java.util.*;
class NoOfHandShakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = sc.nextInt();
        // input number of students
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        // handshake calculation
        System.out.println("No of possible handshakes are" + handshakes);
    }
}

