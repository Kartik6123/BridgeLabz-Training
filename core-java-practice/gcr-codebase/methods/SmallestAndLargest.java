import java.util.*;
class SmallestAndLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();
        int[] result = findSmallestAndLargest(number1, number2, number3);
        //method call
        System.out.println("Smallest number is " + result[0]);
        System.out.println("Largest number is " + result[1]);
    }
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = number1;
        int largest = number1;
        if (number2 < smallest)
            smallest = number2;
        if (number3 < smallest)
            smallest = number3;
        if (number2 > largest)
            largest = number2;
        if (number3 > largest)
            largest = number3;
        //updating largest and smallest values
        int[] smallestAndLargest = new int[2];
        smallestAndLargest[0] = smallest;
        smallestAndLargest[1] = largest;
        return smallestAndLargest;
        //returning array
    }
}

