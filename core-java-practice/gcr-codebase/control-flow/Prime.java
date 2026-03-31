import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        boolean isPrime = true;
        if (number <= 1) {
            //numbers less than or equal to 1 are not prime
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                //check for factors from 2 to square root of number
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
 }
