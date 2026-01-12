package InventoryManagementSystem;

class Inventory {

    AlertService alertService = new LowStockAlert();

    void updateStock(Product product, int soldQty)
            throws OutOfStockException {

        if (soldQty > product.quantity) {
            throw new OutOfStockException(
                product.name + " is out of stock"
            );
        }

        product.quantity -= soldQty;

        if (product.quantity <= 5) {
            alertService.sendAlert(product);
        }
    }
}
