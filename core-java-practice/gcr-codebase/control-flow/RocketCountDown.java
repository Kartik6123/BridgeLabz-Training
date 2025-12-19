import java.util.*;

public class RocketCountDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown number: ");
        int counter = sc.nextInt();
        while (counter >= 1) {
            // Countdown loop
            System.out.println(counter);
            counter--;
        }
        // Launch message
        System.out.println(" Launch the rocket");
    }
}

