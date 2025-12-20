 
import java.util.*;

class LongestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] ht = new double[3];
        // Arrays to store ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + names[i]);
            age[i] = sc.nextInt();
            System.out.println("Enter height of " + names[i]);
            ht[i] = sc.nextDouble();
        }
        // Find youngest and tallest
        int youngest = 0;
        int tallest = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngest]) {
                // Update youngest index
                youngest = i;
            }
            if (ht[i] > ht[tallest]) {
                // Update tallest index
                tallest = i;
            }
        }
        System.out.println("Youngest Friend: " + names[youngest] + " Age: " + age[youngest] );
        System.out.println("Tallest Friend: " + names[tallest] + " Height: " + ht[tallest] );
    }
}
