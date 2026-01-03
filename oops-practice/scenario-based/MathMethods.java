 public class MathMethods {

    static long factorial(int n) {
        if (n < 0) {
            return -1; 
            // invalid case
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int gcd(int a, int b) {
        if (a < 0) a = -a;
        if (b < 0) b = -b;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int fibonacci(int n) {
        if (n < 0) {
            return -1; 
            // invalid case
        }
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println("Factorial Tests:");
        System.out.println("5! = " + factorial(5));
        System.out.println("Prime Number Tests:");
        System.out.println("7 is prime: " + isPrime(7));
        System.out.println("GCD Tests:");
        System.out.println("GCD of 12 and 18: " + gcd(12, 18));
        System.out.println("GCD of -10 and 5: " + gcd(-10, 5));
        System.out.println("Fibonacci Tests:");
        System.out.println("Fibonacci(6): " + fibonacci(6));
    }
}

