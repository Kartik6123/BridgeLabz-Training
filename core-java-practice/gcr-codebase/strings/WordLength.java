import java.util.*;

class WordLengthTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String string = sc.nextLine();
        String[] words = splitText(string);
        String[][] result = createTable(words);
        for (int i = 0; i < result.length; i++) {
            int len = Integer.parseInt(result[i][1]);
            System.out.println(result[i][0] + "\t" + len);
        }
    }

    // Method to split string into words using charAt()
    static String[] splitText(String string) {
        int len = findLength(string);

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

    // Method to find string length without using length()
    static int findLength(String string) {
        int count = 0;
        for (char ch : string.toCharArray()) {
            count++;
        }
        return count;
    }

    // Method to create 2D array of word and its length
    static String[][] createTable(String[] words) {
        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }
        return table;
    }
}
