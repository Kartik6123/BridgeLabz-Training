import java.util.*;
class ToUpperCase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter complete string: ");
        String string = sc.nextLine();

        String builtInUpper = string.toUpperCase();
        String customUpper = convertToUpper(string);

        boolean result = compareStrings(builtInUpper, customUpper);
        if (result) {
            System.out.println("Both methods give the same result: " + customUpper);
        } else {
            System.out.println("Methods give different results.");
            System.out.println("Built-in: " + builtInUpper);
            System.out.println("Custom: " + customUpper);
        }
    }
    // Convert string to uppercase using charAt() and ASCII logic
    static String convertToUpper(String string) {
        String result = "";

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
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

