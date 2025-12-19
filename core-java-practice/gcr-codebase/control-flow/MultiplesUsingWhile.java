 
import java.util.*;

public class MultiplesUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        if (number <= 0 || number >= 100) {
            //invalid input
            System.out.println("Please enter a positive number less than 100");
        } else {
            int counter = number - 1;
            //counter to track multiples below the number
            System.out.println("Multiples of " + number + " below 100 are:");
            while (counter > 1) {
                //check for multiples
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        }
    }
}

