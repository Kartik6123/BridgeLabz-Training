package pillarsofoops;

interface Discountable {
    double applyDiscount();
    void getDiscountDetails();
}

abstract class FoodItem {

    // Order details are protected via encapsulation
    private String itemName;
    private double price;
    private int quantity;

    FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Each food item calculates price differently
    abstract double calculateTotalPrice();

    // Common details for all food items
    void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}

class VegItem extends FoodItem implements Discountable {

    VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.10;
    }

    public void getDiscountDetails() {
        System.out.println("Veg Item Discount: 10%");
    }
}

class NonVegItem extends FoodItem implements Discountable {

    NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 50;
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;
    }

    public void getDiscountDetails() {
        System.out.println("Non-Veg Item Discount: 5%");
    }
}

class Main {

    // Single order-processing method (polymorphism)
    static void processOrder(FoodItem item, Discountable d) {
        item.getItemDetails();
        double total = item.calculateTotalPrice();
        double discount = d.applyDiscount();
        System.out.println("Final Price: " + (total - discount));
        d.getDiscountDetails();
        System.out.println();
    }

    public static void main(String[] args) {

        VegItem v = new VegItem("Paneer Pizza", 250, 2);
        NonVegItem n = new NonVegItem("Chicken Burger", 180, 3);

        processOrder(v, v);
        processOrder(n, n);
    }
}


