import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();
        double[] trigValues = calcFunctions(angle);
        System.out.println("Sine value is " + trigValues[0]);
        System.out.println("Cosine value is " + trigValues[1]);
        System.out.println("Tangent value is " + trigValues[2]);
    }
    public static double[] calcFunctions(double angle) {
        //calculate values
        double radianAngle = Math.toRadians(angle);
        double sine = Math.sin(radianAngle);
        double cosine = Math.cos(radianAngle);
        double tangent = Math.tan(radianAngle);
        double[] result = new double[3];
        result[0] = sine;
        result[1] = cosine;
        result[2] = tangent;
        return result;
    }
}

