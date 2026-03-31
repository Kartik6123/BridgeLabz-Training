import java.util.Scanner;
class Youngest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        // Taking user input for age and height
        for (int index = 0; index < friends.length; index++) {
            System.out.print("Enter age of " + friends[index] + ": ");
            ages[index] = sc.nextInt();
            System.out.print("Enter height of " + friends[index] + ": ");
            heights[index] = sc.nextDouble();
        }
        int youngest = findYoungest(ages);
        // Method call to find youngest
        int tallest = findTallest(heights);
        //Method call to find tallest
        System.out.println("Youngest friend is " + friends[youngest]);
        System.out.println("Tallest friend is " + friends[tallest]);
    }

    // Method to find index of youngest friend
    public static int findYoungest(int[] ages) {
        int youngestIdx = 0;

        for (int index = 1; index < ages.length; index++) {
            if (ages[index] < ages[youngestIdx]) {
                youngestIdx = index;
            }
        }
        return youngestIdx;
    }

    // Method to find index of tallest friend
    public static int findTallest(double[] heights) {
        int tallestIdx = 0;

        for (int index = 1; index < heights.length; index++) {
            if (heights[index] > heights[tallestIdx]) {
                tallestIdx = index;
            }
        }
        return tallestIdx;
    }
}

