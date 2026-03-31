package InventoryManagementSystem;

public class Main {
    public static void main(String[] args) {

        Product p = new Product("P101", "Laptop", 6);
        Inventory inventory = new Inventory();

        try {
            inventory.updateStock(p, 2);
            inventory.updateStock(p, 4);
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        }
    }
}

