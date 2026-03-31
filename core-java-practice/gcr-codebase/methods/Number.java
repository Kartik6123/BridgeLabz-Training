import java.util.Scanner;
class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        // Take user input
        for (int index = 0; index < arr.length; index++) {
            System.out.print("Enter number " + (index + 1) + ": ");
            arr[index] = sc.nextInt();
        }
        for (int index = 0; index < arr.length; index++) {
            //Check for numbers wether postive or negative
            int number = arr[index];
            if (isPositive(number)) {
                if (isEven(number))
                    //check if even or odd
                    System.out.println(number + " is positive and even");
                else
                    System.out.println(number + " is positive and odd");
            } else {
                System.out.println(number + " is negative");
            }
        }

        int result = compare(arr[0], arr[arr.length - 1]);
          // Compare first and last elements
        if (result == 1)
            System.out.println("First element is greater than last element");
        else if (result == -1)
            System.out.println("First element is less than last element");
        else
            System.out.println("First and last elements are equal");
    }

    public static boolean isPositive(int number) {
         // Method to check if number is positive
        return number >= 0;
    }

    public static boolean isEven(int number) {
         // Method to check if number is even
        return number % 2 == 0;
    }

    public static int compare(int number1, int number2) {
        // Method to compare two arr
        if (number1 > number2)
            return 1;
        else if (number1 < number2)
            return -1;
        else
            return 0;
    }
}

