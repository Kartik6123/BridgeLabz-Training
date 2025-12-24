import java.util.*;

class UniqueChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string ");
        String str = sc.nextLine();
        char[] unique = uniqueChar(str);
        System.out.println("Distinct characters:");
        for (int k = 0; k < unique.length; k++) {
            System.out.print(unique[k] + " ");
        }
    }
    // Method to count characters without using length()
    static int countChar(String value) {
        int total = 0;
        for (char c : value.toCharArray()) {
            total++;
        }
        return total;
    }
    // Method to extract unique characters using charAt()
    static char[] uniqueChar(String value) {
        int size = countChar(value);

        char[] unique = new char[size];
        int index = 0;

        for (int x = 0; x < size; x++) {
            char ch = value.charAt(x);
            boolean found = false;
            for (int y = 0; y < x; y++) {
                if (ch == value.charAt(y)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                unique[index++] = ch;
            }
        }
        char[] result = new char[index];
        for (int i = 0; i < index; i++) {
            result[i] = unique[i];
        }
        return result;
    }
}