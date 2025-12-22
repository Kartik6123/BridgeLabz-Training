import java.util.*;

class TrimSpacesUsingCharAt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();
        // Get start and end indexes after trimming
        int[] index = findTrimIndexes(text);
        // Create trimmed string using user-defined method
        String customTrim = createSubstring(text, index[0], index[1]);
        // Built-in trim
        String builtInTrim = text.trim();
        // Compare both strings
        boolean result = compareStrings(customTrim, builtInTrim);
        if (result) {
            System.out.println("Both methods give the same result: '" + customTrim + "'");
        } else {
            System.out.println("Methods give different results.");
            System.out.println("Built-in: '" + builtInTrim );
            System.out.println("Custom: '" + customTrim );
        }
    }
    // Method to find start and end index without spaces
    static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;
        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
         int a[]=new int[2];
            a[0]=start;
            a[1]=end;
            return a;
    }

    // Method to create substring using charAt()
    static String createSubstring(String text, int start, int end) {
        String result = "";

        for (int i = start; i <= end; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }

    // Method to compare two strings using charAt()
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

