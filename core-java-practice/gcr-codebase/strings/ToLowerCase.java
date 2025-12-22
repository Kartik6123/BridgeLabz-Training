import java.util.*;

class ToLowerCase {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter complete string: ");
        String string = sc.nextLine();
        String builtInLower = string.toLowerCase();
        String customLower = convertToLower(string);
        boolean result = compareStrings(builtInLower, customLower);
        if (result) {
            System.out.println("Both methods give the same result: " + customLower);
        } else {
            System.out.println("Methods give different results.");
            System.out.println("Built-in: " + builtInLower);
            System.out.println("Custom: " + customLower);
        }
    }
    // Convert string to lowercase using charAt() and ASCII logic
    static String convertToLower(String string) {
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            result = result + ch;
        }
        return result;
    }
    // Compare two strings using charAt()
    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }
}
