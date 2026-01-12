package ECommerce;

public class Main {
    public static void main(String[] args) throws PaymentFailedException {
        User user = new User("Alice", "U123");
        Product product = new Product("Laptop", 75000.0);
        Order order = new Order(product, 10);
        try {
            order.placeOrder(2);
            Delivery delivery = new Delivery(user, order);
            delivery.product = product;
            delivery.delivery();
        } catch (ProductNotAvailableException e) {
            System.out.println(e.getMessage());
        }

    }
}
