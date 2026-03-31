import java.util.*;

public class Fibonacci {

    // Recursive Fibonacci (O(2^N))
    static int fibonacciRecursive(int n) {
        if (n <= 1)
            return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative Fibonacci (O(N))
    static int fibonacciIterative(int n) {
        if (n <= 1)
            return n;

        int a = 0, b = 1, sum = 0;

        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        long start, end;

        // Recursive Time
        start = System.nanoTime();
        int r = fibonacciRecursive(n);
        end = System.nanoTime();
        System.out.println("Recursive Result: " + r);
        System.out.println("Recursive Time: " + (end - start) + " ns");

        // Iterative Time
        start = System.nanoTime();
        int i = fibonacciIterative(n);
        end = System.nanoTime();
        System.out.println("Iterative Result: " + i);
        System.out.println("Iterative Time: " + (end - start) + " ns");

        sc.close();
    }
}