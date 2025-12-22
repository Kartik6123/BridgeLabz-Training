import java.util.*;

class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char result = firstUnique(text);

        if (result != ' ') {
            System.out.println("First non-repeating character:" + result);
        } else {
            System.out.println("No non-repeating character found");
        }
    }

    // Method to find first non-repeating character using charAt()
    static char firstUnique(String text) {

        int[] freq = new int[256];
        // ASCII frequency array
        for (int i = 0; i < text.length(); i++) {
            // Count frequency of each character
            char ch = text.charAt(i);
            freq[ch]++;
        }
        
        for (int i = 0; i < text.length(); i++) {
            //   Find first character with frequency 1
            char ch = text.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }
        return ' ';
         // indicates no non-repeating character
    }
}
