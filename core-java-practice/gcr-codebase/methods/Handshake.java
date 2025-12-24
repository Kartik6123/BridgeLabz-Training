import java.util.*;
class Handshake {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        //number of students
        int h = handshakes(n);
        //handshake calculation
        System.out.println("The number of possible handshakes is " + h);
    }
    static int handshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}
