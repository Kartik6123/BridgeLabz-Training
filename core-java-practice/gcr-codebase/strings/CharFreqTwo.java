import java.util.*;

class UniqueCharFrequencyApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = sc.nextLine();
        String[][] table = buildTable(str);
        for (int r = 0; r < table.length; r++) {
            System.out.println(table[r][0] + "\t\t" + table[r][1]);
        }
    }

    // Finds unique characters using nested loops
    static char[] uniqueChar(String text) {
        int size = text.length();
        char[] freq = new char[size];
        int pos = 0;

        for (int i = 0; i < size; i++) {
            char current = text.charAt(i);
            boolean repeated = false;

            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)) {
                    repeated = true;
                    break;
                }
            }
            if (!repeated) {
                freq[pos++] = current;
            }
        }
        char[] unique = new char[pos];
        for (int k = 0; k < pos; k++) {
            unique[k] = freq[k];
        }
        return unique;
    }

    // Builds frequency table using unique characters
    static String[][] buildTable(String text) {

        int[] counter = new int[256]; // ASCII frequency array

        // Count frequency
        for (int i = 0; i < text.length(); i++) {
            counter[text.charAt(i)]++;
        }

        // Get unique characters
        char[] uniques = uniqueChar(text);

        String[][] result = new String[uniques.length][2];

        for (int i = 0; i < uniques.length; i++) {
            result[i][0] = String.valueOf(uniques[i]);
            result[i][1] = String.valueOf(counter[uniques[i]]);
        }

        return result;
    }
}
