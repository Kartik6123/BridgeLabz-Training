import java.util.*;

class Invoice {
    private int transactionId;

    public Invoice(int transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Invoice generated for Transaction ID: " + transactionId;
    }
}

public class InvoiceGenerator {

    public static void main(String[] args) {

        List<Integer> transactionIds = Arrays.asList(
            1001, 1002, 1003, 1004
        );

        // Create Invoice objects using constructor reference
        List<Invoice> invoices = transactionIds.stream()
                                                .map(Invoice::new)
                                                .toList();

        invoices.forEach(System.out::println);
    }
}
