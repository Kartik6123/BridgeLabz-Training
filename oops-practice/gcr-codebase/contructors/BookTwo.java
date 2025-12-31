package contructors;
public class BookTwo {

    String title;
    String author;
    double price;
    boolean isAvailable;

    
    BookTwo() {
        // Default constructor
        this.title = "";
        this.author = "";
        this.price = 0.0;
        this.isAvailable = true;
    }

    BookTwo(String title, String author, double price) {
        // Parameterized constructor
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    boolean borrowBook() {
        // Method to borrow book
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have borrowed the book: " + title);
            return true;
        } else {
            System.out.println("Sorry, the book is not available.");
            return false;
        }
    }

    void display() {
        // Display book details
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
        System.out.println();
    }

    public static void main(String[] args) {
        BookTwo book1 = new BookTwo("2 States", "Chetan Bhagat", 500.0);
        book1.display();
        book1.borrowBook();
        book1.display();
    }
}
