import java.util.Scanner;

public class LongestWordSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        // Split sentence into words
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                // Compare lengths of words
                longestWord = word;
            }
        }
        System.out.println("The longest word is: " + longestWord);
    }
}
