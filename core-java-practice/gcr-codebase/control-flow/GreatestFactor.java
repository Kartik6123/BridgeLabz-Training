import java.util.Scanner;
public class GreatestFactor {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int largestFactor = -1;
        if (number <= 0) {
            //negative numbers and zero do not have factors
            System.out.println("Please enter a positive integer");
        } else {
            System.out.println("Factors of " + number + " are:");
            for (int i = 1; i < number; i++) {
                //check for factors
                if (number % i == 0) {
                    largestFactor = Math.max(largestFactor, i);
                    //largestFactor will hold the greatest factor found so far
                }
            }
        }
        System.out.println("Greatest factor of " + number + " is: " + largestFactor);}  
}
