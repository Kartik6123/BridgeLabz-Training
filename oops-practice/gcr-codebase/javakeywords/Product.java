package javakeywords;
public class Product {
    static int discount;
    String productName;
    int price;
    int quantity;
    final int productId;

    static int updateDiscount(int newDiscount) {
        // static method to update discount
        discount = newDiscount;
        return discount;
    }
    Product(String productName, int price, int quantity, int productId) {
        // constructor
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productId = productId;
    }
    void displayProductDetails() {
        // instance method
        if(this instanceof Product){
            // using 'this' keyword
            System.out.println("Product: " + productName + ", Price: " + price +
                               ", Quantity: " + quantity + ", Product ID: " + productId +
                               ", Discount: " + discount + "%");
        }
    }
    public static void main(String[] args) {
        Product.updateDiscount(10);

        Product prod1 = new Product("Laptop", 800, 5, 1001);
        Product prod2 = new Product("Smartphone", 500, 10, 1002);

        prod1.displayProductDetails();
        prod2.displayProductDetails();
    }
}
