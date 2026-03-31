package classandobject;
public class CartItem {
    String itemName;
    double price;
    int quantity;
    CartItem(String itemName, int quantity, double price){
        //constructor to initialize cart item details
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    void addItem(int itemNo){
        //method to add item
        quantity+=itemNo;
        System.out.println("Added "+quantity+" item(s) to the cart.");
    }
    void removeItem(int itemNo){
        //method to remove item
        if(quantity > 0){
            quantity-=itemNo;
            System.out.println("Removed" +quantity+" item from the cart.");
        }
        else{
            System.out.println("No items to remove.");
        }
    }
    double calculateTotalPrice(){
        return quantity * price;
    }
    void display(){
        System.out.println("Item Name: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per Unit: " + price);
        System.out.println("Total Price: " + calculateTotalPrice());
    }
    public static void main(String[] args) {
        CartItem item = new CartItem("Apple", 3, 50.0);
        item.addItem(2);
        item.removeItem(1);
        item.display();
    }
}
