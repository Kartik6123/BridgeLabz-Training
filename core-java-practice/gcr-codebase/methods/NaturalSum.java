import java.util.*;
class NaturalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();
        int sum = findSum(number);
        //sum calculation
        if (number > 0)
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        else
            System.out.println("Please enter a positive natural number");
    }
    static int findSum(int number) {
        //method to find sum
        int sum = 0;
        int i = 1;
        while (i <= number) {
            //loop to calculate sum
            sum = sum + i;
            i++;
        }
        return sum;
    }
}
