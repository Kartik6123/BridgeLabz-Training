public class InventoryManagement {

    // Node class representing each inventory item
    class Node {
        int itemId;
        String itemName;
        int quantity;
        double price;
        Node next;

        Node(int itemId, String itemName, int quantity, double price) {
            this.itemId = itemId;
            this.itemName = itemName;
            this.quantity = quantity;
            this.price = price;
            this.next = null;
        }
    }

    // Head pointer of the singly linked list
    Node head;

    // Add item at beginning
    void addAtBeginning(int itemId, String itemName, int quantity, double price) {
        Node newNode = new Node(itemId, itemName, quantity, price);
        newNode.next = head;
        head = newNode;
    }

    // Add item at end
    void addAtEnd(int itemId, String itemName, int quantity, double price) {
        Node newNode = new Node(itemId, itemName, quantity, price);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    // Add item at specific position
    void addAtPosition(int position, int itemId, String itemName, int quantity, double price) {
        if (position == 1) {
            addAtBeginning(itemId, itemName, quantity, price);
            return;
        }
        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null)
            return;

        Node newNode = new Node(itemId, itemName, quantity, price);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove item using Item ID
    void removeByItemId(int itemId) {
        if (head == null)
            return;

        if (head.itemId == itemId) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.itemId != itemId)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    // Update quantity using Item ID
    void updateQuantity(int itemId, int newQuantity) {
        Node temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                temp.quantity = newQuantity;
                return;
            }
            temp = temp.next;
        }
    }

    // Search item by Item ID
    void searchByItemId(int itemId) {
        Node temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // Search item by Item Name
    void searchByItemName(String itemName) {
        Node temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(itemName)) {
                displayItem(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found)
            System.out.println("Item not found");
    }

    // Calculate total inventory value
    void calculateTotalValue() {
        Node temp = head;
        double total = 0;
        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: " + total);
    }

    // Sort inventory by Item Name or Price
    void sortInventory(boolean sortByName, boolean ascending) {
        if (head == null)
            return;

        for (Node i = head; i.next != null; i = i.next) {
            for (Node j = i.next; j != null; j = j.next) {
                boolean condition;
                if (sortByName)
                    condition = ascending ?
                            i.itemName.compareToIgnoreCase(j.itemName) > 0 :
                            i.itemName.compareToIgnoreCase(j.itemName) < 0;
                else
                    condition = ascending ?
                            i.price > j.price :
                            i.price < j.price;

                if (condition)
                    swapData(i, j);
            }
        }
    }

    // Swap item data between two nodes
    void swapData(Node a, Node b) {
        int id = a.itemId;
        String name = a.itemName;
        int qty = a.quantity;
        double pr = a.price;

        a.itemId = b.itemId;
        a.itemName = b.itemName;
        a.quantity = b.quantity;
        a.price = b.price;

        b.itemId = id;
        b.itemName = name;
        b.quantity = qty;
        b.price = pr;
    }

    // Display all inventory items
    void displayInventory() {
        Node temp = head;
        while (temp != null) {
            displayItem(temp);
            temp = temp.next;
        }
    }

    // Display single item details
    void displayItem(Node node) {
        System.out.println(node.itemId + " " + node.itemName + " " +
                node.quantity + " " + node.price);
    }

    public static void main(String[] args) {
        InventoryManagement im = new InventoryManagement();

        im.addAtEnd(101, "Keyboard", 10, 500);
        im.addAtBeginning(102, "Mouse", 20, 300);
        im.addAtPosition(2, 103, "Monitor", 5, 7000);

        im.displayInventory();

        im.updateQuantity(101, 15);
        im.searchByItemName("Monitor");

        im.calculateTotalValue();

        im.sortInventory(true, true);   // Sort by name ascending
        im.displayInventory();

        im.sortInventory(false, false); // Sort by price descending
        im.displayInventory();
    }
}

