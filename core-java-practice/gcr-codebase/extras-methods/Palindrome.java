import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string : ");
    String str = sc.nextLine();
    boolean isPalindrome = checkPalindrome(str);
    if (isPalindrome) {
      System.out.println(str + " is a palindrome.");
    } else {
      System.out.println(str + " is not a palindrome.");
    }
  }   
    // Checks if a string is a palindrome
    static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
       // Compare characters from both ends
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
