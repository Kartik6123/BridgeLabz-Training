import java.util.*;
class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        //input number
        int result = checkNumber(number);
        //check if positive, negative or zero
        if (result == 1)
            System.out.println("The number is positive");
        else if (result == -1)
            System.out.println("The number is negative");
        else
            System.out.println("The number is zero");
    }

    static int checkNumber(int number) {
        //method to check number
        if (number > 0)
            return 1;
        else if (number < 0)
            return -1;
        else
            return 0;
    }
}
