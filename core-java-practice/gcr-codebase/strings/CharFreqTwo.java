import java.util.*;

class UniqueCharFrequencyApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter str: ");
        String str = sc.nextLine();
        String[][] table = buildTable(str);
        for (int r = 0; r < table.length; r++) {
            System.out.println(table[r][0] + "\t" + table[r][1]);
        }
    }
    // Finds unique characters using nested loops
    static char[] uniqueChar(String str) {
        int size = str.length();
        char[] freq = new char[size];
        int pos = 0;

        for (int i = 0; i < size; i++) {
            char curr = str.charAt(i);
            boolean repeated = false;

            for (int j = 0; j < i; j++) {
                if (curr == str.charAt(j)) {
                    repeated = true;
                    break;
                }
            }
            if (!repeated) {
                freq[pos++] = curr;
            }
        }
        char[] unique = new char[pos];
        for (int k = 0; k < pos; k++) {
            unique[k] = freq[k];
        }
        return unique;
    }

    // Builds frequency table using unique characters
    static String[][] buildTable(String str) {

        int[] counter = new int[256]; // ASCII frequency array

        // Count frequency
        for (int i = 0; i < str.length(); i++) {
            counter[str.charAt(i)]++;
        }

        // Get unique characters
        char[] uniques = uniqueChar(str);

        String[][] result = new String[uniques.length][2];

        for (int i = 0; i < uniques.length; i++) {
            result[i][0] = String.valueOf(uniques[i]);
            result[i][1] = String.valueOf(counter[uniques[i]]);
        }

        return result;
    }
}
