import java.util.*;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
            System.out.println("Factors of " + number + " are:");
            for (int i = 1; i < number; i++) {
                //loop to find factors
                if (number % i == 0) {
                    //check for factors
                    System.out.println(i);
                }
            }
        }
    }

