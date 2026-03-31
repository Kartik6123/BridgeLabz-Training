import java.util.*;
class VowelTable{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = sc.nextLine();
        String[][] result = separateCharacters(string);
        displayTable(result);
    }
    // Method to analyze characters and return 2D array
    static String[][] separateCharacters(String string) {
        String[][] data = new String[string.length()][2];
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            data[i][0] = String.valueOf(ch);
            data[i][1] = checkCharacterType(ch);
        }

        return data;
    }
    // Method to check character type
    static String checkCharacterType(char ch) {
        // Convert uppercase to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }
        // Check if letter
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }
    // Method to display 2D array in tabular format
    static void displayTable(String[][] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }
}
