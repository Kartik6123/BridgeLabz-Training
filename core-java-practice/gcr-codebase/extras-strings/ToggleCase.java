import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String toggledStr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                // If character is uppercase, convert to lowercase
                toggledStr += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                // If character is lowercase, convert to uppercase
                toggledStr += Character.toUpperCase(ch);
            } else {
                // Non-alphabetic characters remain unchanged
                toggledStr += ch;
            }
        }
        System.out.println("Toggled case string: " + toggledStr);
    }
}
