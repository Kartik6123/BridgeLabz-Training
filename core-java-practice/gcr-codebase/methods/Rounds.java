import java.util.*;
class Rounds {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 in meters: ");
        int a = sc.nextInt();
        //side 1
        System.out.print("Enter side 2 in meters: ");
        int b = sc.nextInt();
        //side 2
        System.out.print("Enter side 3 in meters: ");
        int c = sc.nextInt();
        //side 3
        double r = rounds(a, b, c);
        //rounds calculation
        System.out.println("The athlete must complete " + r + " rounds to run 5 km");
    }
    static double rounds(int a, int b, int c) {
        int p = a + b + c;
        return 5000.0 / p;
    }
}
