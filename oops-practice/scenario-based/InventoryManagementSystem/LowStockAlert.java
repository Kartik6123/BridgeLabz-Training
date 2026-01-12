package InventoryManagementSystem;

class LowStockAlert implements AlertService {
    public void sendAlert(Product product) {
        System.out.println(
            "Low stock alert: " + product.name +
            " | Remaining: " + product.quantity
        );
    }
}
