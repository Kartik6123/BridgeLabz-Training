package FlipKeyProblem;

import java.util.Scanner;

public class Program {

    public static String CleanseAndInvert(String input) {

        // Rule 1: null or length less than 6
        if (input == null || input.length() < 6) {
            return "";
        }

        // Rule 2: only alphabets allowed (no space, digit, special char)
        for (char ch : input.toCharArray()) {
            if (!Character.isLetter(ch)) {
                return "";
            }
        }

        // Convert to lowercase
        input = input.toLowerCase();

        // Remove characters with even ASCII values
        StringBuilder filtered = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if ((int) ch % 2 != 0) {   // odd ASCII only
                filtered.append(ch);
            }
        }

        // Reverse the string
        filtered.reverse();

        // Convert characters at even index to uppercase
        for (int i = 0; i < filtered.length(); i++) {
            if (i % 2 == 0) {
                filtered.setCharAt(i, Character.toUpperCase(filtered.charAt(i)));
            }
        }

        return filtered.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String input = sc.nextLine();

        String result = CleanseAndInvert(input);

        if (result.isEmpty()) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("The generated key is - " + result);
        }

        sc.close();
    }
}

