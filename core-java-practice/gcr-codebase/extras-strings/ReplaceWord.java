import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the original string: ");
        String str = sc.nextLine();
        System.out.print("Enter the word to be replaced: ");
        String oldWord = sc.nextLine();
        System.out.print("Enter the new word: ");
        String newWord = sc.nextLine();
        String result = str.replace(oldWord, newWord);
        // Replace old word with new word
        System.out.println("Modified string: " + result);
    }
}
