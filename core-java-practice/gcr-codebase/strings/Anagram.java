import java.util.*;

class AnagramChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first text: ");
        String string1 = sc.nextLine();
        System.out.print("Enter second text: ");
        String string2 = sc.nextLine();
        boolean result = isAnagram(string1, string2);
        if (result) {
            System.out.println("The given texts are anagrams.");
        } else {
            System.out.println("The given texts are not anagrams.");
        }
    }
    static boolean isAnagram(String s1, String s2) {
           // Method to check if two texts are anagrams
        if (s1.length() != s2.length()) {
            return false;
        }
        //  Check lengths
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];
        //   Create frequency arrays
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i)]++;
            freq2[s2.charAt(i)]++;
        }
         //   Count frequency of characters
        for (int i = 0; i < 256; i++) {
            //   Compare frequencies
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }
        return true;
    }
}

