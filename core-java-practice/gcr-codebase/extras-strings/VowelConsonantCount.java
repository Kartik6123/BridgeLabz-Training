import java.util.Scanner;
public class VowelConsonantCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int vowelCount = 0;
        int consonantCount = 0;
        char [] arr = str.toCharArray();
        for (char ch : arr)  {
            if (ch<='z' && ch>='a' || ch<='Z' && ch>='A') {
               // Check if the character is a letter
                char lowerCh = Character.toLowerCase(ch);
                 // Convert to lowercase for uniformity
                if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}
