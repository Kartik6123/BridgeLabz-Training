import java.util.*;

class Palindrome  {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String string = sc.nextLine();
        boolean loop = loop(string);
        boolean rec = recursion(string, 0, string.length() - 1);
        boolean arr = array(string);
        System.out.println("Using Loop       : " + loop);
        System.out.println("Using Recursion  : " + rec);
        System.out.println("Using Array      : " + arr);
    }

    // Loop-based palindrome check
    static boolean loop(String data) {
        int left = 0;
        int right = data.length() - 1;

        while (left < right) {
            if (data.charAt(left) != data.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    //  Recursive palindrome check
    static boolean recursion(String data, int begin, int finish) {

        if (begin >= finish) {
            return true;
        }

        if (data.charAt(begin) != data.charAt(finish)) {
            return false;
        }

        return recursion(data, begin + 1, finish - 1);
    }

    //   Array comparison palindrome check
    static boolean array(String data) {

        char[] original = data.toCharArray();
        char[] reversed = reverseCharacters(data);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to reverse string using charAt()
    static char[] reverseCharacters(String data) {
        int size = data.length();
        char[] rev = new char[size];

        for (int i = 0; i < size; i++) {
            rev[i] = data.charAt(size - i - 1);
        }

        return rev;
    }
}
