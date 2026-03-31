 import java.util.Scanner;
class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        int minLength = Math.min(str1.length(), str2.length());
        // Determine the minimum length of the two strings
        int result = 0;
        for (int i = 0; i < minLength; i++) {
            // Compare characters one by one
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            if (ch1 != ch2) {
                result = ch1 - ch2;
                break;
            }
        }
        if (result == 0) {
            // If all characters are equal up to minLength
            result = str1.length() - str2.length();
        }
        if (result < 0) {
            System.out.println( str1 + " is lexicographically smaller than " + str2);
        } else if (result > 0) {
            System.out.println( str1 + " is lexicographically greater than " + str2);
        } else {
            System.out.println("Both strings are equal.");
        }
    }
}

