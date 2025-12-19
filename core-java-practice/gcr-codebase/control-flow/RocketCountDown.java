import java.util.*;

public class RocketCountDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting count for the rocket launch: ");
        int launchCounter = sc.nextInt();
        while (launchCounter >= 1) {
            // Countdown loop
            System.out.println(launchCounter);
            launchCounter--;
        }
          // Launch message
        System.out.println("Rocket Launched!");
    }
}

