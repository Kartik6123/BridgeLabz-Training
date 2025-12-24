import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int[] arr = findFactors(number);
        //method call to find factors
        System.out.print("Factors are: ");
        for (int factor : arr) {
            System.out.print(factor + " ");
        }
        System.out.println();
        int sum = findSum(arr);
        int product = findProduct(arr);
        int sumOfSquares = findSumOfSquares(arr);
        //calculating sum, product and sum of squares of factors
        System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
    }          
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                count++;
        }
          //counting factors
        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    public static int findSum(int[] factors) {
        //method to find sum
        int sum = 0;
        for (int value : factors)
            sum += value;
        return sum;
    }

    public static int findProduct(int[] factors) {
        //method to find product
        int product = 1;
        for (int value : factors)
            product *= value;
        return product;
    }

    public static int findSumOfSquares(int[] factors) {
        //method to find sum of squares
        int sum = 0;
        for (int value : factors)
            sum += Math.pow(value, 2);
        return sum;
    }
}

