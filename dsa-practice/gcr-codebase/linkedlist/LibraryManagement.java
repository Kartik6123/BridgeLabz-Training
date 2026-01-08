package linkedlist;
public class LibraryManagement {
    // Inner Node class representing each book
    class Node {
        String bookTitle;
        String author;
        String genre;
        int bookId;
        boolean isAvailable;
        Node next;
        Node prev;

        // Constructor to initialize book details
        Node(String bookTitle, String author, String genre, int bookId, boolean isAvailable) {
            this.bookTitle = bookTitle;
            this.author = author;
            this.genre = genre;
            this.bookId = bookId;
            this.isAvailable = isAvailable;
            this.next = null;
            this.prev = null;
        }
    }

    // Head pointer of the doubly linked list
    Node head;

    // Add book at the beginning
    void addAtBeginning(String bookTitle, String author, String genre, int bookId, boolean isAvailable) {
        Node newNode = new Node(bookTitle, author, genre, bookId, isAvailable);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }

    // Add book at the end
    void addAtEnd(String bookTitle, String author, String genre, int bookId, boolean isAvailable) {
        Node newNode = new Node(bookTitle, author, genre, bookId, isAvailable);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Add book at a specific position
    void addAtPosition(int position, String bookTitle, String author, String genre, int bookId, boolean isAvailable) {
        if (position == 1) {
            addAtBeginning(bookTitle, author, genre, bookId, isAvailable);
            return;
        }

        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null)
            return;

        Node newNode = new Node(bookTitle, author, genre, bookId, isAvailable);
        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null)
            temp.next.prev = newNode;

        temp.next = newNode;
    }

    // Remove a book using Book ID
    void removeByBookId(int bookId) {
        if (head == null)
            return;

        if (head.bookId == bookId) {
            head = head.next;
            if (head != null)
                head.prev = null;
            return;
        }

        Node temp = head;
        while (temp != null && temp.bookId != bookId)
            temp = temp.next;

        if (temp == null)
            return;

        if (temp.next != null)
            temp.next.prev = temp.prev;

        temp.prev.next = temp.next;
    }

    // Search book by title
    void searchByTitle(String title) {
        Node temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.bookTitle.equalsIgnoreCase(title)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found)
            System.out.println("Book not found");
    }

    // Search book by author
    void searchByAuthor(String author) {
        Node temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found)
            System.out.println("Book not found");
    }

    // Update availability status using Book ID
    void updateAvailability(int bookId, boolean status) {
        Node temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.isAvailable = status;
                return;
            }
            temp = temp.next;
        }
    }

    // Display books in forward order
    void displayForward() {
        Node temp = head;
        while (temp != null) {
            displayBook(temp);
            temp = temp.next;
        }
    }

    // Display books in reverse order
    void displayReverse() {
        if (head == null)
            return;

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        while (temp != null) {
            displayBook(temp);
            temp = temp.prev;
        }
    }

    // Count total number of books
    void countBooks() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Total Books: " + count);
    }

    // Display single book details
    void displayBook(Node node) {
        System.out.println(
                node.bookId + " " +
                node.bookTitle + " " +
                node.author + " " +
                node.genre + " " +
                (node.isAvailable ? "Available" : "Not Available")
        );
    }

    public static void main(String[] args) {
        LibraryManagement lm = new LibraryManagement();

        lm.addAtEnd("Java Basics", "James Gosling", "Programming", 101, true);
        lm.addAtBeginning("Clean Code", "Robert Martin", "Software", 102, true);
        lm.addAtPosition(2, "Data Structures", "Mark Allen", "CS", 103, false);

        lm.displayForward();
        lm.displayReverse();

        lm.searchByAuthor("Robert Martin");
        lm.updateAvailability(103, true);

        lm.removeByBookId(101);
        lm.countBooks();
    }
}
