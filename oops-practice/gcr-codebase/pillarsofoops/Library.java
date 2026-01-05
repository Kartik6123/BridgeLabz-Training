package pillarsofoops;

interface Reservable {
    // Interface for reservable items
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

abstract class LibraryItem {

    // Common item details
    private String itemId;
    private String title;
    private String author;

    LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Each item decides its own loan duration
    abstract int getLoanDuration();

    // Common method shared by all items
    void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Book extends LibraryItem implements Reservable {

    // Borrower details kept private
    private boolean available = true;
    private String borrowerName;

    Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    int getLoanDuration() {
        return 14;
    }

    public void reserveItem(String borrowerName) {
        this.borrowerName = borrowerName;
        available = false;
    }

    public boolean checkAvailability() {
        return available;
    }
}

class Magazine extends LibraryItem implements Reservable {

    private boolean available = true;

    Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    int getLoanDuration() {
        return 7;
    }

    public void reserveItem(String borrowerName) {
        available = false;
    }

    public boolean checkAvailability() {
        return available;
    }
}

class DVD extends LibraryItem implements Reservable {

    private boolean available = true;

    DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    int getLoanDuration() {
        return 3;
    }

    public void reserveItem(String borrowerName) {
        available = false;
    }

    public boolean checkAvailability() {
        return available;
    }
}

class Main {
    public static void main(String[] args) {
 
        Book b = new Book("B101", "Java Basics", "James");
        Magazine m = new Magazine("M201", "Tech Monthly", "Editorial");
        DVD d = new DVD("D301", "Inception", "Nolan");

        b.getItemDetails();
        System.out.println("Loan Duration: " + b.getLoanDuration());
        b.reserveItem("Alice");
        System.out.println("Available: " + b.checkAvailability());
        System.out.println();

        m.getItemDetails();
        System.out.println("Loan Duration: " + m.getLoanDuration());
        m.reserveItem("Bob");
        System.out.println("Available: " + m.checkAvailability());
        System.out.println();

        d.getItemDetails();
        System.out.println("Loan Duration: " + d.getLoanDuration());
        d.reserveItem("Charlie");
        System.out.println("Available: " + d.checkAvailability());
    }
}
