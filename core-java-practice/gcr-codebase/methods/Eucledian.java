import java.util.Scanner;
public class Eucledian {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 y1: ");
        // Input for first point
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter x2 y2: ");
        // Input for second point
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distance = findDistance(x1, y1, x2, y2);
        //finding distance           
        double[] line = findLineEquation(x1, y1, x2, y2);
         // Finding line equation parameters
        System.out.println("Euclidean Distance: " + distance);
        System.out.println("Equation of Line: y = " + line[0] + "x + " + line[1]);
    }

    static double findDistance(double x1, double y1, double x2, double y2) {
        // Calculate Euclidean distance
        return Math.sqrt(
                Math.pow(x2 - x1, 2) +
                Math.pow(y2 - y1, 2)
        );
    }

    static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        // Calculate slope (m) and y-intercept (b) of the line
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - (m * x1);

        return new double[]{m, b};
    }
}