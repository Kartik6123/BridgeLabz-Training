import java.util.Scanner;

class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        // Coefficient a
        double a = sc.nextDouble();
        System.out.print("Enter value of b: ");
        // Coefficient b
        double b = sc.nextDouble();
        System.out.print("Enter value of c: ");
        // Coefficient c
        double c = sc.nextDouble();
        double[] roots = findRoots(a, b, c);
        // Find roots
        if (roots.length == 2) {
            System.out.println("Root 1 = " + roots[0]);
            System.out.println("Root 2 = " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("Root = " + roots[0]);
        } else {
            System.out.println("No real roots exist");
        }
    }
    public static double[] findRoots(double a, double b, double c) {
         // Method to find roots of quadratic equation
        double cofficent = Math.pow(b, 2) - (4 * a * c);
        if (cofficent > 0) {
            double root1 = (-b + Math.sqrt(cofficent)) / (2 * a);
            double root2 = (-b - Math.sqrt(cofficent)) / (2 * a);

            double[] result = new double[2];
            result[0] = root1;
            result[1] = root2;
            return result;
        } 
        else if (cofficent == 0) {
            double root = -b / (2 * a);
            double[] result = new double[1];
            result[0] = root;
            return result;
        } 
        else {
            double[] result = new double[0];
            return result;
        }
    }
}
