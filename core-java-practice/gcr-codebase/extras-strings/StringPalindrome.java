import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String revStr = "";
        char[] arr = str.toCharArray();
        // Convert string to character array
        for (int i = arr.length - 1; i >= 0; i--) {
            // Loop from end to start
            revStr += arr[i];
        }
        if (str.equals(revStr)) {
            // Check if original string and reversed string are equal
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
