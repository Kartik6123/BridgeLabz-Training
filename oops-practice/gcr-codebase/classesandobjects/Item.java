package classesandobjects;
public class Item {
    String itemCode;
    String itemName;
    double price;
    Item(String itemCode, String itemName, double price){
        //constructor to initialize item details
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    void display(){
        //method to display item details
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }
    double totalPrice(int quantity){
        //method to calculate total price
        return price * quantity;
    }
    public static void main(String[] args) {
        Item item = new Item("I001", "Laptop", 75000.0);
        item.display();
        int quantity = 2;
        System.out.println("Total Price for " + quantity + " items: " + item.totalPrice(quantity));
    }
}
