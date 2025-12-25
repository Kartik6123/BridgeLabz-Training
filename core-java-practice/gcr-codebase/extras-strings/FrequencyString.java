import java.util.Scanner;
public class FrequencyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int[] freq = new int[256]; 
        // Calculate frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }
        // Find the character with the maximum frequency
        int maxFreq = -1;
        char ch = ' ';
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                ch = (char) i;
            }
        }
        System.out.println("Most Frequent Character: '" + ch + "' using freq array");
    }
}

