import java.util.*;
class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        int p = sc.nextInt();
        //principal amount
        System.out.print("Enter Rate: ");
        int r = sc.nextInt();
        //rate of interest
        System.out.print("Enter Time: ");
        int t = sc.nextInt();
        //time period
        int si = calc(p, r, t);
        //simple interest calculation
        System.out.println("The Simple Interest is " + si +
                           " for Principal " + p +
                           ", Rate of Interest " + r +
                           " and Time " + t);
    }
    static int calc(int p, int r, int t) {
        return (p * r * t) / 100;
    }
}
