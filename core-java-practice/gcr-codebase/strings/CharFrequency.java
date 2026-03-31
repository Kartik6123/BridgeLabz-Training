import java.util.*;
class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String[][] result = charFreq(str);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + result[i][1]);
        }
    }
    static String[][] charFreq(String str) {
        // Method to find frequency of characters using charAt()
        int[] freq = new int[256];   
        // ASCII frequency array
        for (int i = 0; i < str.length(); i++) {
            // Count frequency of each character
            char ch = str.charAt(i);
            freq[ch]++;
        }
        int uniqueCount = 0;
        //  Count unique characters
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] != 0) {
                uniqueCount++;
                freq[str.charAt(i)] = 0; 
                // mark counted
            }
        }
        for (int i = 0; i < str.length(); i++) {
            // Step 3: Recalculate frequency (needed again)
            freq[str.charAt(i)]++;
        }
        String[][] result = new String[uniqueCount][2];
        // Store character and frequency in 2D array
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (freq[ch] != 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                index++;
                freq[ch] = 0; 
                // avoid duplicate entry
            }
        }

        return result;
    }
}

