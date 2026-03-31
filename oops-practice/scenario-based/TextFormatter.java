import java.util.*;

public class TextFormatter {

    // Method to correct spacing and capitalization in a paragraph
    public static String formatParagraph(String paragraph) {

        // Remove extra spaces and trim leading/trailing spaces
        paragraph = paragraph.trim().replaceAll("\\s+", " ");

        StringBuilder res = new StringBuilder();
        boolean cap = true;   // Flag to capitalize the first letter of a sentence

        for (int i = 0; i < paragraph.length(); i++) {
            char ch = paragraph.charAt(i);

            // Capitalize first letter after punctuation
            if (cap && Character.isLetter(ch)) {
                res.append(Character.toUpperCase(ch));
                cap = false;
            } else {
                res.append(ch);
            }

            // Check for sentence-ending punctuation
            if (ch == '.' || ch == '?' || ch == '!') {
                cap = true;

                // Ensure exactly one space after punctuation
                if (i + 1 < paragraph.length() && paragraph.charAt(i + 1) != ' ') {
                    res.append(' ');
                }
            }
        }

        return res.toString().trim();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking paragraph input from user
        System.out.println("Enter the paragraph:");
        String input = sc.nextLine();

        // Formatting the paragraph
        String ans = formatParagraph(input);

        // Displaying corrected text
        System.out.println("Corrected Text:");
        System.out.println(ans);
    }
}
