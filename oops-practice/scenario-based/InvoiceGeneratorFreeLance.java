import java.util.*;

class InvalidInvoiceFormatException extends Exception {
    InvalidInvoiceFormatException(String msg) {
        super(msg);
    }
}

public class InvoiceGeneratorFreeLance {

    static String[] parseInvoice(String input) throws InvalidInvoiceFormatException {
        if (!input.contains("-")) {
            throw new InvalidInvoiceFormatException("Invalid invoice format");
        }
        return input.split(",");
    }

    static int getTotalAmount(String[] tasks) throws InvalidInvoiceFormatException {
        int total = 0;

        for (String task : tasks) {
            String[] parts = task.trim().split("-");

            if (parts.length < 2) {
                throw new InvalidInvoiceFormatException("Invalid task format");
            }

            String amountStr = parts[1].trim().split(" ")[0];
            total += Integer.parseInt(amountStr);
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter invoice details:");
        String input = sc.nextLine();

        try {
            String[] tasks = parseInvoice(input);
            int total = getTotalAmount(tasks);
            System.out.println("Total Invoice Amount: " + total + " INR");
        } catch (InvalidInvoiceFormatException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}

