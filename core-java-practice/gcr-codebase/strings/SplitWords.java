import java.util.*;

class SplitWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter complete string: ");
        String string = sc.nextLine();
        string.trim();
        String[] builtInSplit = string.split(" ");
        // Built-in split
        String[] customSplit = customSplit(string);
        // User-defined split
        boolean result = compare(builtInSplit, customSplit);
        if (result) {
            // Compare results
            System.out.println("Both methods give the same result:");
            for (String word : customSplit) {
                System.out.println(word);
            }
        } else {
            System.out.println("Methods give different results.");
            System.out.println("Built-in split:");
            for (String word : builtInSplit) {
                System.out.println(word);
            }
            System.out.println("Custom split:");
            for (String word : customSplit) {
                System.out.println(word);
            }
        }
    }
    // Method to find string length without using length()
    static int findLength(String string) {
        int count = 0;
        for (char ch : string.toCharArray()) {
            count++;
        }
        return count;
    }
    // Method to split string into words using charAt()
    static String[] customSplit(String string) {
        int len = findLength(string);
        //   Count words
        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (string.charAt(i) == ' ') {
                wordCount++;
            }
        }
        //  Store space indexes
        int[] spaceIndex = new int[wordCount + 1];
        int idx = 0;
        spaceIndex[idx++] = -1;

        for (int i = 0; i < len; i++) {
            if (string.charAt(i) == ' ') {
                spaceIndex[idx++] = i;
            }
        }
        spaceIndex[idx] = len;
        //   Extract words
        String[] words = new String[wordCount];

        for (int i = 0; i < wordCount; i++) {
            String word = "";
            for (int j = spaceIndex[i] + 1; j < spaceIndex[i + 1]; j++) {
                word = word + string.charAt(j);
            }
            words[i] = word;
        }

        return words;
    }

    // Method to compare two string arrays
    static boolean compare(String[] a1, String[] a2) {
        if (a1.length != a2.length)
            return false;

        for (int i = 0; i < a1.length; i++) {
            if (!a1[i].equals(a2[i]))
                return false;
        }
        return true;
    }
}

