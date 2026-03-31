import java.util.*;
class MeanHeight  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;
        // Input heights
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + ": ");
            heights[i] = sc.nextDouble();
        }
        // Calculate sum of heights
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        // Calculate mean height
        double mean = sum / heights.length;
        // Display result
        System.out.println("Mean height of the football team = " + mean);
    }
}
