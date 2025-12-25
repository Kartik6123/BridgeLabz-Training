import java.util.Scanner;

public class SubstringOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String str= sc.nextLine();
        System.out.print("Enter the substring to search: ");
        String substr = sc.nextLine();
        int count = 0;
        for (int i = 0; i <= str.length() - substr.length(); i++) {
            // Loop through the main string
            if (str.substring(i, i + substr.length()).equals(substr)) {
                // Check if substring matches
                count++;
            }
        }
    }
}
