import java.util.*;

public class LexicalTwist {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first word");
        String first = sc.nextLine();

        // Validation for first word
        if (first.contains(" ")) {
            System.out.println(first + " is an invalid word");
            return;
        }

        System.out.println("Enter the second word");
        String second = sc.nextLine();

        // Validation for second word
        if (second.contains(" ")) {
            System.out.println(second + " is an invalid word");
            return;
        }

        // Reverse first word
        String reversedFirst = new StringBuilder(first).reverse().toString();

        // Case 1: second word is reverse of first
        if (reversedFirst.equalsIgnoreCase(second)) {

            String result = reversedFirst.toLowerCase();
            result = result.replaceAll("[aeiou]", "@");
            System.out.println(result);

        } else {

            // Case 2: not reverse
            String combined = (first + second).toUpperCase();

            int vowels = 0, consonants = 0;
            for (char ch : combined.toCharArray()) {
                if (ch >= 'A' && ch <= 'Z') {
                    if ("AEIOU".indexOf(ch) != -1)
                        vowels++;
                    else
                        consonants++;
                }
            }

            if (vowels > consonants) {
                printFirstTwoUnique(combined, "AEIOU");
            } else if (consonants > vowels) {
                printFirstTwoUnique(combined, "BCDFGHJKLMNPQRSTVWXYZ");
            } else {
                System.out.println("Vowels and consonants are equal");
            }
        }
        sc.close();
    }

    // Method to print first 2 unique characters
    private static void printFirstTwoUnique(String word, String allowedChars) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (char ch : word.toCharArray()) {
            if (allowedChars.indexOf(ch) != -1) {
                set.add(ch);
            }
            if (set.size() == 2)
                break;
        }

        for (char ch : set) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
