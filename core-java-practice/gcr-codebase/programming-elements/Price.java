import java.util.Scanner;

public class Price {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of the item: ");
        int price = sc.nextInt();
        // price input
        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();
        // quantity input
        int totalCost = price * quantity;
        // total cost calculation
        System.out.println("The total purchase price is INR " + totalCost + " if the quantity " + quantity + " and unit price is INR " + price);
    }
}
