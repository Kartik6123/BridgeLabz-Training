import java.util.*;

public class Multiples{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = sc.nextInt();
        if (number <= 0 || number >= 100) {
            //invalid input
            System.out.println("Please enter a positive number less than 100");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");
            //using for loop to find multiples
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                    //multiple found
                }
            }
        }
    }
}

