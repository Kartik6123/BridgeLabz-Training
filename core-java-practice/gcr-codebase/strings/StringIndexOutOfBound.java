import java.util.*;

class StringIndexOutOfBound {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        // This method will generate the exception
        generateException(text);

        // This method will handle the exception
        handleException(text);
    }

    static void generateException(String s) {
        int idx = s.length();   // invalid index
        System.out.println(s.charAt(idx));  // causes exception
    }

    static void handleException(String s) {
        int idx = s.length();   // invalid index
        try {
            System.out.println(s.charAt(idx));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Please enter a valid index between 0 and " + (s.length() - 1) + ".");
        }
    }
}

