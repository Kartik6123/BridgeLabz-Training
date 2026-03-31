import java.util.Scanner;
public class RocketCountDownTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown start number: ");
        int startNumber = sc.nextInt();
        // Countdown from the given number to zero
        for (int i = startNumber; i >= 0; i--) {
            // Print the current countdown number
            System.out.println(i);
        }
        System.out.println("Rocket Launched!");
    }
}
