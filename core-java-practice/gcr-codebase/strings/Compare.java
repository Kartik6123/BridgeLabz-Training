import java.util.*;
class  Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.next();
        System.out.print("Enter second string: ");
        String str2 = sc.next();
        boolean result1 = check(str1, str2);
        // Compare using charAt() method in check function
        boolean result2 = str1.equals(str2);
        // Compare using equals() method
        if (result1 == result2) {
            System.out.println("Results are the same using both methods");
        } else {
            System.out.println("Results are different using both methods");
        }
    }
    static boolean check(String a, String b) {
        //method to compare two strings using charAt()
        if (a.length() != b.length()) {
            return false;
        }
        // Compare characters one by one
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
            // Early exit if mismatch found
        }
        return true;
    }
}

