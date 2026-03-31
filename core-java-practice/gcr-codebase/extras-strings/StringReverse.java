import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String revStr = "";
        // Initialize empty string for reversed string
        char[] arr = str.toCharArray();
        // Convert string to character array
        for (int i = arr.length - 1; i >= 0; i--) {
            // Loop from end to start
            revStr += arr[i];
        }
        System.out.println("Reversed string: " + revStr);
    }
}
