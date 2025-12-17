import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b =sc.nextInt();//input base 
        int e = sc.nextInt();//input exponent;
        int r = 0;
         r= (int) Math.pow(b, e);//power calculation using Math.pow method
        System.out.println("Result is: " + r);//output
    }
}
