import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();
        int[] result = RemainderQuotient(number, divisor);
        //method call
        System.out.println("Quotient is " + result[0]);
        System.out.println("Remainder is " + result[1]);
        //displaying quotient and remainder
    }
    public static int[] RemainderQuotient(int number, int divisor) {
        int quotient = number / divisor;
        //calculating quotient
        int remainder = number % divisor;
        //calculating remainder
        int[] arr = new int[2];
        arr[0] = quotient;
        arr[1] = remainder;
        return arr;
    }
}

