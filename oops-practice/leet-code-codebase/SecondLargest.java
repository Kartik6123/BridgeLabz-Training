import java.util.*;

public class SecondLargest {

    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        int max = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != max) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();      
        // size of array
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); 
            // array elements
        }

        SecondLargest s = new SecondLargest();
        System.out.println(s.getSecondLargest(arr));
    }
}
