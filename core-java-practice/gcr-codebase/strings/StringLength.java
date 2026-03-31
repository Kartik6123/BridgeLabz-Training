import java.util.*;

class StringLengthWithoutMethod {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();  
        int calcLength = findLength(str);
        int builtInLength = str.length();
        System.out.println("Length using user-defined method: " + calcLength);
        System.out.println("Length using built-in method " + builtInLength);
    }

    static int findLength(String str) {
            // Method to find string length without using length()
        int count = 0;
        try {
            while (true) {
            str.charAt(count); 
            // access each character
                count++;
            }
        } catch (RuntimeException e) {
            // Exception occurs when index goes out of bounds
            return count;
        }
    }

}

