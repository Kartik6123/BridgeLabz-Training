import java.util.Scanner;

public class BusDistanceTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalDistance = 0;

        while (true) {
            System.out.print("Enter distance to next stop (km): ");
            int distance = sc.nextInt();
            totalDistance += distance; 
            // add distance of each stop
            System.out.print("Do you want to get off? yes/no: ");
            String str = sc.next();
            if (str.equalsIgnoreCase("yes")) {
                break; 
                // exit loop on confirmation
            }
        }
        System.out.println("Total distance travelled: " + totalDistance + " km");
    }
}
