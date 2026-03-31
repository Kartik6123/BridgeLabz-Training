import java.util.*;
class NumberException {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        String text = sc.nextLine();
        // First call: generates exception (will stop program if invalid)
        createsException(text);
        // Second call: handles exception safely
        handlesException(text);
    }
    static void createsException(String text) {
        int number = Integer.parseInt(text);  
        // Exception occurs here
        System.out.println("Number is: " + number);
    }
    //   Handles NumberFormatException using try-catch
    static void handlesException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred: Input is not a valid number");
        } catch (RuntimeException e) {
            System.out.println("Some other RuntimeException occurred");
        }
    }
}
  
