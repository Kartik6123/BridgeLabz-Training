 

package inheritance;

public class Order {
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Base order status
    String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    // Status updated at shipping level
    String getOrderStatus() {
        return "Order Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Final status at delivery level
    String getOrderStatus() {
        return "Order Delivered";
    }
}

 class Main {
    public static void main(String[] args) {

        // Polymorphism with multilevel inheritance
        Order o1 = new Order(101, "01-10-2025");
        Order o2 = new ShippedOrder(102, "02-10-2025", "TRK123");
        Order o3 = new DeliveredOrder(103, "03-10-2025", "TRK456", "05-10-2025");

        System.out.println(o1.getOrderStatus());
        System.out.println(o2.getOrderStatus());
        System.out.println(o3.getOrderStatus());
    }
}

