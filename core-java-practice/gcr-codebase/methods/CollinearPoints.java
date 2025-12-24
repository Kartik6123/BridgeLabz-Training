import java.util.Scanner;
public class CollinearPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 y1: ");
        // Input for first point
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.print("Enter x2 y2: ");
        // Input for second point
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.print("Enter x3 y3: ");
        // Input for third point
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        boolean slopeResult = CollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean areaResult = CollinearByArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Using Slope Formula: " + (slopeResult ? "Collinear" : "Not Collinear"));
        System.out.println("Using Area Formula: " + (areaResult ? "Collinear" : "Not Collinear"));
    }

    static boolean CollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
         // Calculate slopes using cross multiplication to avoid division
        int slopeAB_Y = y2 - y1;
        int slopeAB_X = x2 - x1;
        int slopeBC_Y = y3 - y2;
        int slopeBC_X = x3 - x2;
        int slopeAC_Y = y3 - y1;
        int slopeAC_X = x3 - x1;
        // Check if slopes are equal using cross multiplication
        return slopeAB_Y * slopeBC_X == slopeBC_Y * slopeAB_X &&
               slopeAB_Y * slopeAC_X == slopeAC_Y * slopeAB_X;
    }

    static boolean CollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate area using the determinant method
        double area = 0.5 * (x1 * (y2 - y3)
                           + x2 * (y3 - y1)
                           + x3 * (y1 - y2));

        return area == 0;
    }
}
