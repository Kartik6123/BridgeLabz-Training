 import java.util.Scanner;
public class CoffeeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Coffee Shop!");
         while(true){
            System.out.print("Enter your coffee choice:\n" +
                            "1. Espresso\n" +
                            "2. Latte\n" +
                            "3. Cappuccino\n" +
                            "4. Exit the shop\n" +
                             "Your choice: ");
            int choice = sc.nextInt();
            if (choice == 4) {
                System.out.println("Thank you for visiting! Goodbye!");
                return;
            }
            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            double price = 0.0;
            switch (choice) {
                // Coffee menu options
                case 1:
                    price =100 * quantity;
                    // Calculate price for Espresso.Assuming price of Espresso is 100 rupess.
                    System.out.println("----------Bill Details:----------");
                    System.out.println("You ordered " + quantity + " Espresso(s). Total price: " + price+" rupees");
                    break;
                case 2:
                    price = 120 * quantity;
                    // Calculate price for Latte. Assuming price of Latte is 120 rupees.
                    System.out.println("----------Bill Details:----------");
                    System.out.println("You ordered " + quantity + " Latte(s). Total price: " + price+" rupees");
                    break;
                case 3:
                     // Calculate price for Cappuccino. Assuming price of Cappuccino is 130 rupees.
                    price = 130 * quantity;
                    System.out.println("----------Bill Details:----------");
                    System.out.println("You ordered " + quantity + " Cappuccino(s). Total price: " + price+" rupees");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            } 

    }
}}
