import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter the character to remove: ");
        char chToRemove = sc.next().charAt(0);
        // Read character to remove
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            // Loop through each character
            if (str.charAt(i) != chToRemove) {
                result += str.charAt(i);
            }
        }
        System.out.println("String after removing '" + chToRemove + "': " + result);
    }
}
