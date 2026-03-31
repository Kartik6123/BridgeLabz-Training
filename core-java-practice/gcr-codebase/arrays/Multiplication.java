import java.util.*;

class MultiplicationTable6To9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int[] result = new int[4];
        // Calculate multiplication table from 6 to 9
        int index = 0;
        for (int i = 6; i <= 9; i++) {
            result[index] = number * i;
            index++;
        }
        // Display result
        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + result[index]);
            index++;
        }
    }
}
