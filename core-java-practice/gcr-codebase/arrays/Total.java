import java.util.*;

class StoreNumbersAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;
        // Input values
        while (true) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();
            if (num <= 0) {
                break;
            }
            if (index == 10) {
                break;
            }
            arr[index] = num;
            index++;
        }
        // Calculate total
        for (int i = 0; i < index; i++) {
            total += arr[i];
        }
        // Display total
        System.out.println("\nTotal = " + total);
    }
}
