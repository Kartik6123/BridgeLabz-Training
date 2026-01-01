import java.util.*;

public class ParagraphAnalyzer {

    // Method to analyze paragraph
    static void analyzeParagraph(String para, String oldWord, String newWord) {
        // Handle empty or space-only paragraph
        if (para == null || para.trim().isEmpty()) {
            System.out.println("Paragraph is empty. Nothing to analyze.");
            return;
        }
        // Split paragraph into words
        String[] words = para.trim().split("\\s+");

        // Word count
        int wordCount = words.length;

        // Find longest word
        String longestWord = words[0];
        for (String w : words) {
            if (w.length() > longestWord.length()) {
                longestWord = w;
            }
        }

        // Replace word (case-insensitive)
        String replacedParagraph =
                para.replaceAll("(?i)\\b" + oldWord + "\\b", newWord);

        // Display results
        System.out.println("Word Count: " + wordCount);
        System.out.println("Longest Word: " + longestWord);
        System.out.println("Modified Paragraph:");
        System.out.println(replacedParagraph);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking paragraph input
        System.out.println("Enter the paragraph:");
        String paragraph = sc.nextLine();

        // Taking words for replacement
        System.out.print("Enter word to replace: ");
        String oldWord = sc.nextLine();

        System.out.print("Enter new word: ");
        String newWord = sc.nextLine();

        analyzeParagraph(paragraph, oldWord, newWord);
    }
}
