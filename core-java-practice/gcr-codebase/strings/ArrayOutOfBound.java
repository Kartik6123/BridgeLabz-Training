import java.util.*;
class ArrayOutOfBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name:");
            names[i] = sc.nextLine();
        }
        generateException(names);
        //generates exception 
        handleException(names);
        // handles exception safely
    }
 
    static void generateException(String[] names) {
        //  Generates ArrayIndexOutOfBoundsException (no handling)
        System.out.println("Accessing invalid index:");
        System.out.println(names[names.length]); 
        // Invalid index
    }
    static void handleException(String[] names) {
            // Handles ArrayIndexOutOfBoundsException
        try {
            System.out.println("Accessing invalid index inside try block:");
            System.out.println(names[names.length]); 
            // Invalid index.Exception occurs here
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: Invalid index accessed");
        } catch (RuntimeException e) {
            System.out.println("Some other RuntimeException occurred");
        }
    }
}

