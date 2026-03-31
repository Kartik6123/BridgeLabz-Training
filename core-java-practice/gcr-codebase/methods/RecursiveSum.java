import java.util.*;
class RecursiveSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Please enter a valid natural number");
            return;
        }
        int recursiveSum = RecursiveNaturalSum(number);
        //sum using recursion
        int formulaSum = FormulativeSum(number);
        //sum using formula
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);
        if (recursiveSum == formulaSum)
            //comparing both results
            System.out.println("Both results are correct and equal");
        else
            System.out.println("Results are not equal");
    }

    public static int RecursiveNaturalSum(int number) {
        //recursive method to find sum
        if (number == 1)
            return 1;
        return number + RecursiveNaturalSum(number - 1);
    }

    public static int FormulativeSum(int number) {
        //method using formula
        return number * (number + 1) / 2;
    }
}
