public class PaymentGateway {
    interface PaymentProcessor {
        void pay(double amount);
        // Default method
        default void refund(double amount) {
            System.out.println("Refund of ₹" + amount + " processed");
        }
    }
    static class UPIProcessor implements PaymentProcessor {
        public void pay(double amount) {
            System.out.println("Paid ₹" + amount + " using UPI");
        }
    }
    static class CardProcessor implements PaymentProcessor {
        public void pay(double amount) {
            System.out.println("Paid ₹" + amount + " using Card");
        }
    }

    public static void main(String[] args) {
        PaymentProcessor upi = new UPIProcessor();
        upi.pay(500);
        upi.refund(200); // default method
    }
}
