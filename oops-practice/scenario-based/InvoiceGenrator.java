import java.util.*;

class InvoiceGenerator {
    static int parseInvoice(String input) { 
        String[] tasks = input.split(",");
        return getTotalAmount(tasks);
    }

    static int getTotalAmount(String[] tasks) { 
        //get total amount
        int total = 0;
        for (String task : tasks) {
            String[] parts = task.trim().split("-");
            String amountPart = parts[1].trim().split(" ")[0];
            total += Integer.parseInt(amountPart);
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter invoice details:");
        String input = sc.nextLine();
        int totalAmount = parseInvoice(input);
        System.out.println("Total Invoice Amount: " + totalAmount + " INR");
    }
}
